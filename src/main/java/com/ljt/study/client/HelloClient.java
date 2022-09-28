package com.ljt.study.client;

import com.ljt.study.grpc.HelloProto;
import com.ljt.study.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author LiJingTang
 * @date 2022-09-28 15:45
 */
@Slf4j
public class HelloClient {

    private final HelloServiceGrpc.HelloServiceBlockingStub helloService;

    public HelloClient(ManagedChannel channel) {
        helloService = HelloServiceGrpc.newBlockingStub(channel);
    }

    public void sayHello() {
        HelloProto.HelloRequest request = HelloProto.HelloRequest.newBuilder().setName("World").build();
        HelloProto.HelloReply reply = helloService.sayHello(request);
        log.info("grpc - {}", reply.getMessage());
    }

}
