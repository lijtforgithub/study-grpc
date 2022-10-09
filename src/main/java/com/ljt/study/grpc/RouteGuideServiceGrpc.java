package com.ljt.study.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: route_guide.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RouteGuideServiceGrpc {

  private RouteGuideServiceGrpc() {}

  public static final String SERVICE_NAME = "RouteGuideService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.Point,
      com.ljt.study.grpc.RouteGuideProto.Feature> getGetFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeature",
      requestType = com.ljt.study.grpc.RouteGuideProto.Point.class,
      responseType = com.ljt.study.grpc.RouteGuideProto.Feature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.Point,
      com.ljt.study.grpc.RouteGuideProto.Feature> getGetFeatureMethod() {
    io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.Point, com.ljt.study.grpc.RouteGuideProto.Feature> getGetFeatureMethod;
    if ((getGetFeatureMethod = RouteGuideServiceGrpc.getGetFeatureMethod) == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        if ((getGetFeatureMethod = RouteGuideServiceGrpc.getGetFeatureMethod) == null) {
          RouteGuideServiceGrpc.getGetFeatureMethod = getGetFeatureMethod =
              io.grpc.MethodDescriptor.<com.ljt.study.grpc.RouteGuideProto.Point, com.ljt.study.grpc.RouteGuideProto.Feature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ljt.study.grpc.RouteGuideProto.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ljt.study.grpc.RouteGuideProto.Feature.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideServiceMethodDescriptorSupplier("GetFeature"))
              .build();
        }
      }
    }
    return getGetFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.Rectangle,
      com.ljt.study.grpc.RouteGuideProto.Feature> getListFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFeatures",
      requestType = com.ljt.study.grpc.RouteGuideProto.Rectangle.class,
      responseType = com.ljt.study.grpc.RouteGuideProto.Feature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.Rectangle,
      com.ljt.study.grpc.RouteGuideProto.Feature> getListFeaturesMethod() {
    io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.Rectangle, com.ljt.study.grpc.RouteGuideProto.Feature> getListFeaturesMethod;
    if ((getListFeaturesMethod = RouteGuideServiceGrpc.getListFeaturesMethod) == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        if ((getListFeaturesMethod = RouteGuideServiceGrpc.getListFeaturesMethod) == null) {
          RouteGuideServiceGrpc.getListFeaturesMethod = getListFeaturesMethod =
              io.grpc.MethodDescriptor.<com.ljt.study.grpc.RouteGuideProto.Rectangle, com.ljt.study.grpc.RouteGuideProto.Feature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ljt.study.grpc.RouteGuideProto.Rectangle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ljt.study.grpc.RouteGuideProto.Feature.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideServiceMethodDescriptorSupplier("ListFeatures"))
              .build();
        }
      }
    }
    return getListFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.Point,
      com.ljt.study.grpc.RouteGuideProto.RouteSummary> getRecordRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordRoute",
      requestType = com.ljt.study.grpc.RouteGuideProto.Point.class,
      responseType = com.ljt.study.grpc.RouteGuideProto.RouteSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.Point,
      com.ljt.study.grpc.RouteGuideProto.RouteSummary> getRecordRouteMethod() {
    io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.Point, com.ljt.study.grpc.RouteGuideProto.RouteSummary> getRecordRouteMethod;
    if ((getRecordRouteMethod = RouteGuideServiceGrpc.getRecordRouteMethod) == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        if ((getRecordRouteMethod = RouteGuideServiceGrpc.getRecordRouteMethod) == null) {
          RouteGuideServiceGrpc.getRecordRouteMethod = getRecordRouteMethod =
              io.grpc.MethodDescriptor.<com.ljt.study.grpc.RouteGuideProto.Point, com.ljt.study.grpc.RouteGuideProto.RouteSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ljt.study.grpc.RouteGuideProto.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ljt.study.grpc.RouteGuideProto.RouteSummary.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideServiceMethodDescriptorSupplier("RecordRoute"))
              .build();
        }
      }
    }
    return getRecordRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.RouteNote,
      com.ljt.study.grpc.RouteGuideProto.RouteNote> getRouteChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouteChat",
      requestType = com.ljt.study.grpc.RouteGuideProto.RouteNote.class,
      responseType = com.ljt.study.grpc.RouteGuideProto.RouteNote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.RouteNote,
      com.ljt.study.grpc.RouteGuideProto.RouteNote> getRouteChatMethod() {
    io.grpc.MethodDescriptor<com.ljt.study.grpc.RouteGuideProto.RouteNote, com.ljt.study.grpc.RouteGuideProto.RouteNote> getRouteChatMethod;
    if ((getRouteChatMethod = RouteGuideServiceGrpc.getRouteChatMethod) == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        if ((getRouteChatMethod = RouteGuideServiceGrpc.getRouteChatMethod) == null) {
          RouteGuideServiceGrpc.getRouteChatMethod = getRouteChatMethod =
              io.grpc.MethodDescriptor.<com.ljt.study.grpc.RouteGuideProto.RouteNote, com.ljt.study.grpc.RouteGuideProto.RouteNote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RouteChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ljt.study.grpc.RouteGuideProto.RouteNote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ljt.study.grpc.RouteGuideProto.RouteNote.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideServiceMethodDescriptorSupplier("RouteChat"))
              .build();
        }
      }
    }
    return getRouteChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteGuideServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceStub>() {
        @java.lang.Override
        public RouteGuideServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideServiceStub(channel, callOptions);
        }
      };
    return RouteGuideServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteGuideServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceBlockingStub>() {
        @java.lang.Override
        public RouteGuideServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideServiceBlockingStub(channel, callOptions);
        }
      };
    return RouteGuideServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouteGuideServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceFutureStub>() {
        @java.lang.Override
        public RouteGuideServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideServiceFutureStub(channel, callOptions);
        }
      };
    return RouteGuideServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RouteGuideServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 简单 RPC
     * </pre>
     */
    public void getFeature(com.ljt.study.grpc.RouteGuideProto.Point request,
        io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.Feature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * 服务器端流式 RPC
     * </pre>
     */
    public void listFeatures(com.ljt.study.grpc.RouteGuideProto.Rectangle request,
        io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.Feature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFeaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * 客户端流式 RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.RouteSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRecordRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 双向流式 RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.RouteNote> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRouteChatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeatureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ljt.study.grpc.RouteGuideProto.Point,
                com.ljt.study.grpc.RouteGuideProto.Feature>(
                  this, METHODID_GET_FEATURE)))
          .addMethod(
            getListFeaturesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.ljt.study.grpc.RouteGuideProto.Rectangle,
                com.ljt.study.grpc.RouteGuideProto.Feature>(
                  this, METHODID_LIST_FEATURES)))
          .addMethod(
            getRecordRouteMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.ljt.study.grpc.RouteGuideProto.Point,
                com.ljt.study.grpc.RouteGuideProto.RouteSummary>(
                  this, METHODID_RECORD_ROUTE)))
          .addMethod(
            getRouteChatMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.ljt.study.grpc.RouteGuideProto.RouteNote,
                com.ljt.study.grpc.RouteGuideProto.RouteNote>(
                  this, METHODID_ROUTE_CHAT)))
          .build();
    }
  }

  /**
   */
  public static final class RouteGuideServiceStub extends io.grpc.stub.AbstractAsyncStub<RouteGuideServiceStub> {
    private RouteGuideServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 简单 RPC
     * </pre>
     */
    public void getFeature(com.ljt.study.grpc.RouteGuideProto.Point request,
        io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.Feature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 服务器端流式 RPC
     * </pre>
     */
    public void listFeatures(com.ljt.study.grpc.RouteGuideProto.Rectangle request,
        io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.Feature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 客户端流式 RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.RouteSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRecordRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 双向流式 RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.RouteNote> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRouteChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RouteGuideServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RouteGuideServiceBlockingStub> {
    private RouteGuideServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 简单 RPC
     * </pre>
     */
    public com.ljt.study.grpc.RouteGuideProto.Feature getFeature(com.ljt.study.grpc.RouteGuideProto.Point request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 服务器端流式 RPC
     * </pre>
     */
    public java.util.Iterator<com.ljt.study.grpc.RouteGuideProto.Feature> listFeatures(
        com.ljt.study.grpc.RouteGuideProto.Rectangle request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListFeaturesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RouteGuideServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RouteGuideServiceFutureStub> {
    private RouteGuideServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 简单 RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ljt.study.grpc.RouteGuideProto.Feature> getFeature(
        com.ljt.study.grpc.RouteGuideProto.Point request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE = 0;
  private static final int METHODID_LIST_FEATURES = 1;
  private static final int METHODID_RECORD_ROUTE = 2;
  private static final int METHODID_ROUTE_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteGuideServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouteGuideServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((com.ljt.study.grpc.RouteGuideProto.Point) request,
              (io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.Feature>) responseObserver);
          break;
        case METHODID_LIST_FEATURES:
          serviceImpl.listFeatures((com.ljt.study.grpc.RouteGuideProto.Rectangle) request,
              (io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.Feature>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRoute(
              (io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.RouteSummary>) responseObserver);
        case METHODID_ROUTE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeChat(
              (io.grpc.stub.StreamObserver<com.ljt.study.grpc.RouteGuideProto.RouteNote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RouteGuideServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouteGuideServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ljt.study.grpc.RouteGuideProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouteGuideService");
    }
  }

  private static final class RouteGuideServiceFileDescriptorSupplier
      extends RouteGuideServiceBaseDescriptorSupplier {
    RouteGuideServiceFileDescriptorSupplier() {}
  }

  private static final class RouteGuideServiceMethodDescriptorSupplier
      extends RouteGuideServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouteGuideServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouteGuideServiceFileDescriptorSupplier())
              .addMethod(getGetFeatureMethod())
              .addMethod(getListFeaturesMethod())
              .addMethod(getRecordRouteMethod())
              .addMethod(getRouteChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
