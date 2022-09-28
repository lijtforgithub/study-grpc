package com.ljt.study.server;

import lombok.SneakyThrows;

import java.util.concurrent.CountDownLatch;

/**
 * @author LiJingTang
 * @date 2022-09-28 15:42
 */
public class Server {

    @SneakyThrows
    public static void main(String[] args) {
        GrpcServer grpcServer = new GrpcServer(8888);
        grpcServer.start();

        new CountDownLatch(1).await();
    }

}
