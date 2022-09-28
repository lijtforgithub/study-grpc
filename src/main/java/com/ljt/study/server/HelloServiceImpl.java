package com.ljt.study.server;

import com.ljt.study.grpc.HelloProto;
import com.ljt.study.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @author LiJingTang
 * @date 2022-09-28 14:27
 */
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloReply> responseObserver) {
        HelloProto.HelloReply reply = HelloProto.HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
