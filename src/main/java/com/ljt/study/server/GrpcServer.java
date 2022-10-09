package com.ljt.study.server;

import com.ljt.study.grpc.RouteGuideProto;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * @author LiJingTang
 * @date 2022-09-28 15:40
 */
@Slf4j
public class GrpcServer {

    private final int port;
    private final Server server;

    public GrpcServer(int port) throws IOException {
        this(port, RouteGuideUtil.getDefaultFeaturesFile());
    }

    public GrpcServer(int port, URL featureFile) throws IOException {
        this(ServerBuilder.forPort(port), port, RouteGuideUtil.parseFeatures(featureFile));
    }

    public GrpcServer(ServerBuilder<?> serverBuilder, int port, Collection<RouteGuideProto.Feature> features) {
        this.port = port;
        server = serverBuilder
                .addService(new HelloServiceImpl())
                .addService(new RouteGuideServiceImpl(features))
                .build();
    }

    public void start() throws IOException {
        server.start();
        log.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                GrpcServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("*** server shut down");
        }));
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws Exception {
        GrpcServer server = new GrpcServer(8888);
        server.start();
        server.blockUntilShutdown();
    }

}
