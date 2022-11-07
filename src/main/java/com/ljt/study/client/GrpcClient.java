package com.ljt.study.client;

import com.ljt.study.grpc.RouteGuideProto;
import com.ljt.study.server.RouteGuideUtil;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author LiJingTang
 * @date 2022-09-28 15:50
 */
@Slf4j
public class GrpcClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888).usePlaintext().build();
//        new HelloClient(channel).sayHello();

        routeGuide(channel);
    }

    @SneakyThrows
    private static void routeGuide(ManagedChannel channel) {
        try {
            List<RouteGuideProto.Feature> features = RouteGuideUtil.parseFeatures(RouteGuideUtil.getDefaultFeaturesFile());
            RouteGuideClient client = new RouteGuideClient(channel);
            // Looking for a valid feature
            client.getFeature(409146138, -746188906);

            // Feature missing.
//            client.getFeature(0, 0);

            // Looking for features between 40, -75 and 42, -73.
//            client.listFeatures(400000000, -750000000, 420000000, -730000000);

            // Record a few randomly selected points from the features file.
//            client.recordRoute(features, 10);

            // Send and receive some notes.
//            CountDownLatch finishLatch = client.routeChat();
//
//            if (!finishLatch.await(1, TimeUnit.MINUTES)) {
//                log.warn("routeChat can not finish within 1 minutes");
//            }
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }

}
