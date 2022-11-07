package com.ljt.study.server;

import com.ljt.study.grpc.RouteGuideProto;
import com.ljt.study.grpc.RouteGuideServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static java.lang.Math.*;
import static java.util.concurrent.TimeUnit.NANOSECONDS;

/**
 * @author LiJingTang
 * @date 2022-10-09 15:43
 */
@Slf4j
public class RouteGuideServiceImpl extends RouteGuideServiceGrpc.RouteGuideServiceImplBase {

    private final Collection<RouteGuideProto.Feature> features;
    private final ConcurrentMap<RouteGuideProto.Point, List<RouteGuideProto.RouteNote>> routeNotes = new ConcurrentHashMap<>();

    RouteGuideServiceImpl(Collection<RouteGuideProto.Feature> features) {
        this.features = features;
    }

    @Override
    public void getFeature(RouteGuideProto.Point request, StreamObserver<RouteGuideProto.Feature> responseObserver) {
        responseObserver.onNext(checkFeature(request));
        responseObserver.onCompleted();
    }

    /**
     * 服务器端流式
     */
    @Override
    public void listFeatures(RouteGuideProto.Rectangle request, StreamObserver<RouteGuideProto.Feature> responseObserver) {
        int left = min(request.getLo().getLongitude(), request.getHi().getLongitude());
        int right = max(request.getLo().getLongitude(), request.getHi().getLongitude());
        int top = max(request.getLo().getLatitude(), request.getHi().getLatitude());
        int bottom = min(request.getLo().getLatitude(), request.getHi().getLatitude());

        for (RouteGuideProto.Feature feature : features) {
            if (!RouteGuideUtil.exists(feature)) {
                continue;
            }

            int lat = feature.getLocation().getLatitude();
            int lon = feature.getLocation().getLongitude();
            if (lon >= left && lon <= right && lat >= bottom && lat <= top) {
                responseObserver.onNext(feature);
            }
        }
        responseObserver.onCompleted();
    }

    /**
     * 客户端流式
     */
    @Override
    public StreamObserver<RouteGuideProto.Point> recordRoute(final StreamObserver<RouteGuideProto.RouteSummary> responseObserver) {
        return new StreamObserver<RouteGuideProto.Point>() {
            int pointCount;
            int featureCount;
            int distance;
            RouteGuideProto.Point previous;
            final long startTime = System.nanoTime();

            @Override
            public void onNext(RouteGuideProto.Point point) {
                pointCount++;
                if (RouteGuideUtil.exists(checkFeature(point))) {
                    featureCount++;
                }
                // For each point after the first, add the incremental distance from the previous point to
                // the total distance value.
                if (previous != null) {
                    distance += calcDistance(previous, point);
                }
                previous = point;
            }

            @Override
            public void onError(Throwable t) {
                log.warn("recordRoute cancelled");
            }

            @Override
            public void onCompleted() {
                long seconds = NANOSECONDS.toSeconds(System.nanoTime() - startTime);
                responseObserver.onNext(RouteGuideProto.RouteSummary.newBuilder()
                        .setPointCount(pointCount)
                        .setFeatureCount(featureCount).setDistance(distance)
                        .setElapsedTime((int) seconds).build());
                responseObserver.onCompleted();
            }
        };
    }

    /**
     * 双向流式
     */
    @Override
    public StreamObserver<RouteGuideProto.RouteNote> routeChat(final StreamObserver<RouteGuideProto.RouteNote> responseObserver) {
        return new StreamObserver<RouteGuideProto.RouteNote>() {
            @Override
            public void onNext(RouteGuideProto.RouteNote note) {
                List<RouteGuideProto.RouteNote> notes = getOrCreateNotes(note.getLocation());

                // Respond with all previous notes at this location.
                for (RouteGuideProto.RouteNote prevNote : notes.toArray(new RouteGuideProto.RouteNote[0])) {
                    responseObserver.onNext(prevNote);
                }

                // Now add the new note to the list
                notes.add(note);
            }

            @Override
            public void onError(Throwable t) {
                log.warn("routeChat cancelled");
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    private List<RouteGuideProto.RouteNote> getOrCreateNotes(RouteGuideProto.Point location) {
        List<RouteGuideProto.RouteNote> notes = Collections.synchronizedList(new ArrayList<>());
        List<RouteGuideProto.RouteNote> prevNotes = routeNotes.putIfAbsent(location, notes);
        return prevNotes != null ? prevNotes : notes;
    }

    private RouteGuideProto.Feature checkFeature(RouteGuideProto.Point location) {
        for (RouteGuideProto.Feature feature : features) {
            if (feature.getLocation().getLatitude() == location.getLatitude()
                    && feature.getLocation().getLongitude() == location.getLongitude()) {
                return feature;
            }
        }

        return RouteGuideProto.Feature.newBuilder().setName("").setLocation(location).build();
    }

    private static int calcDistance(RouteGuideProto.Point start, RouteGuideProto.Point end) {
        // earth radius in meters
        int r = 6371000;
        double lat1 = toRadians(RouteGuideUtil.getLatitude(start));
        double lat2 = toRadians(RouteGuideUtil.getLatitude(end));
        double lon1 = toRadians(RouteGuideUtil.getLongitude(start));
        double lon2 = toRadians(RouteGuideUtil.getLongitude(end));
        double deltaLat = lat2 - lat1;
        double deltaLon = lon2 - lon1;

        double a = sin(deltaLat / 2) * sin(deltaLat / 2) + cos(lat1) * cos(lat2) * sin(deltaLon / 2) * sin(deltaLon / 2);
        double c = 2 * atan2(sqrt(a), sqrt(1 - a));

        return (int) (r * c);
    }

}
