package com.ljt.study.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.SneakyThrows;

/**
 * @author LiJingTang
 * @date 2022-09-28 15:40
 */
public class GrpcServer {

    private Server server;

    public GrpcServer(int port) {
        server = ServerBuilder.forPort(port)
                .addService(new HelloServiceImpl())
                .build();
    }

    @SneakyThrows
    public void start() {
        server.start();
    }

    public void shutdown() {
        server.shutdown();
    }

}
