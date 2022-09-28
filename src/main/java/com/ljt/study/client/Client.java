package com.ljt.study.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author LiJingTang
 * @date 2022-09-28 15:50
 */
public class Client {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888).usePlaintext().build();
        new HelloClient(channel).sayHello();
    }

}
