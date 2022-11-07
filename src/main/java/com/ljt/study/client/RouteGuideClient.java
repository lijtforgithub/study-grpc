package com.ljt.study.client;

import com.ljt.study.grpc.RouteGuideProto;
import com.ljt.study.grpc.RouteGuideServiceGrpc;
import com.ljt.study.server.RouteGuideUtil;
import io.grpc.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author LiJingTang
 * @date 2022-10-09 16:13
 */
@Slf4j
public class RouteGuideClient {

    private final RouteGuideServiceGrpc.RouteGuideServiceBlockingStub blockingStub;
    private final RouteGuideServiceGrpc.RouteGuideServiceStub asyncStub;

    private final Random random = new Random();

    public RouteGuideClient(Channel channel) {
        blockingStub = RouteGuideServiceGrpc.newBlockingStub(channel);
        asyncStub = RouteGuideServiceGrpc.newStub(channel);
    }

    /**
     * Blocking unary call example.  Calls getFeature and prints the response.
     */
    public void getFeature(int lat, int lon) {
        log.info("*** GetFeature: lat={} lon={}", lat, lon);

        RouteGuideProto.Point request = RouteGuideProto.Point.newBuilder().setLatitude(lat).setLongitude(lon).build();
        RouteGuideProto.Feature feature;

        try {
            feature = blockingStub.getFeature(request);
        } catch (StatusRuntimeException e) {
            log.warn("RPC failed: {}", e.getStatus());
            return;
        }

        if (RouteGuideUtil.exists(feature)) {
            log.info("Found feature called \"{}\" at {}, {}",
                    feature.getName(),
                    RouteGuideUtil.getLatitude(feature.getLocation()),
                    RouteGuideUtil.getLongitude(feature.getLocation()));
        } else {
            log.info("Found no feature at {}, {}",
                    RouteGuideUtil.getLatitude(feature.getLocation()),
                    RouteGuideUtil.getLongitude(feature.getLocation()));
        }
    }

    /**
     * Blocking server-streaming example. Calls listFeatures with a rectangle of interest. Prints each
     * response feature as it arrives.
     */
    public void listFeatures(int lowLat, int lowLon, int hiLat, int hiLon) {
        log.info("*** ListFeatures: lowLat={} lowLon={} hiLat={} hiLon={}", lowLat, lowLon, hiLat, hiLon);

        RouteGuideProto.Rectangle request = RouteGuideProto.Rectangle.newBuilder()
                        .setLo(RouteGuideProto.Point.newBuilder().setLatitude(lowLat).setLongitude(lowLon).build())
                        .setHi(RouteGuideProto.Point.newBuilder().setLatitude(hiLat).setLongitude(hiLon).build()).build();
        Iterator<RouteGuideProto.Feature> features;
        try {
            features = blockingStub.listFeatures(request);
            for (int i = 1; features.hasNext(); i++) {
                RouteGuideProto.Feature feature = features.next();
                log.info("Result #{} : {}", i, feature);
            }
        } catch (StatusRuntimeException e) {
            log.warn("RPC failed: {}", e.getStatus());
        }
    }

    /**
     * Async client-streaming example. Sends {@code numPoints} randomly chosen points from {@code
     * features} with a variable delay in between. Prints the statistics when they are sent from the
     * server.
     */
    public void recordRoute(List<RouteGuideProto.Feature> features, int numPoints) throws InterruptedException {
        log.info("*** RecordRoute");
        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<RouteGuideProto.RouteSummary> responseObserver = new StreamObserver<RouteGuideProto.RouteSummary>() {
            @Override
            public void onNext(RouteGuideProto.RouteSummary summary) {
                log.info("Finished trip with {} points. Passed {} features. Travelled {} meters. It took {} seconds.",
                        summary.getPointCount(), summary.getFeatureCount(), summary.getDistance(), summary.getElapsedTime());
            }

            @Override
            public void onError(Throwable t) {
                log.warn("RecordRoute Failed: {}", Status.fromThrowable(t));
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                log.info("Finished RecordRoute");
                finishLatch.countDown();
            }
        };

        StreamObserver<RouteGuideProto.Point> requestObserver = asyncStub.recordRoute(responseObserver);
        try {
            // Send numPoints points randomly selected from the features list.
            for (int i = 0; i < numPoints; ++i) {
                int index = random.nextInt(features.size());
                RouteGuideProto.Point point = features.get(index).getLocation();
                log.info("Visiting point {}, {}", RouteGuideUtil.getLatitude(point), RouteGuideUtil.getLongitude(point));
                requestObserver.onNext(point);
                // Sleep for a bit before sending the next one.
                Thread.sleep(random.nextInt(1000) + 500);
                if (finishLatch.getCount() == 0) {
                    // RPC completed or errored before we finished sending.
                    // Sending further requests won't error, but they will just be thrown away.
                    return;
                }
            }
        } catch (RuntimeException e) {
            // Cancel RPC
            requestObserver.onError(e);
            throw e;
        }
        // Mark the end of requests
        requestObserver.onCompleted();

        // Receiving happens asynchronously
        if (!finishLatch.await(1, TimeUnit.MINUTES)) {
            log.warn("recordRoute can not finish within 1 minutes");
        }
    }

    /**
     * Bi-directional example, which can only be asynchronous. Send some chat messages, and print any
     * chat messages that are sent from the server.
     */
    public CountDownLatch routeChat() {
        log.info("*** RouteChat");
        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<RouteGuideProto.RouteNote> requestObserver =
                asyncStub.routeChat(new StreamObserver<RouteGuideProto.RouteNote>() {
                    @Override
                    public void onNext(RouteGuideProto.RouteNote note) {
                        log.info("Got message \"{}\" at {}, {}", note.getMessage(), note.getLocation().getLatitude(), note.getLocation().getLongitude());
                    }

                    @Override
                    public void onError(Throwable t) {
                        log.warn("RouteChat Failed: {}", Status.fromThrowable(t));
                        finishLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        log.info("Finished RouteChat");
                        finishLatch.countDown();
                    }
                });

        try {
            RouteGuideProto.RouteNote[] requests = {newNote("First message", 0, 0), newNote("Second message", 0, 10_000_000),
                            newNote("Third message", 10_000_000, 0), newNote("Fourth message", 10_000_000, 10_000_000)};

            for (RouteGuideProto.RouteNote request : requests) {
                log.info("Sending message \"{}\" at {}, {}", request.getMessage(), request.getLocation().getLatitude(), request.getLocation().getLongitude());
                requestObserver.onNext(request);
            }
        } catch (RuntimeException e) {
            // Cancel RPC
            requestObserver.onError(e);
            throw e;
        }
        // Mark the end of requests
        requestObserver.onCompleted();

        // return the latch while receiving happens asynchronously
        return finishLatch;
    }

    private RouteGuideProto.RouteNote newNote(String message, int lat, int lon) {
        return RouteGuideProto.RouteNote.newBuilder().setMessage(message)
                .setLocation(RouteGuideProto.Point.newBuilder().setLatitude(lat).setLongitude(lon).build()).build();
    }

}
