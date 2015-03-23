package grpc.testing;

import static io.grpc.stub.Calls.createMethodDescriptor;
import static io.grpc.stub.Calls.asyncUnaryCall;
import static io.grpc.stub.Calls.asyncServerStreamingCall;
import static io.grpc.stub.Calls.asyncClientStreamingCall;
import static io.grpc.stub.Calls.duplexStreamingCall;
import static io.grpc.stub.Calls.blockingUnaryCall;
import static io.grpc.stub.Calls.blockingServerStreamingCall;
import static io.grpc.stub.Calls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class TestServiceGrpc {

  private static final io.grpc.stub.Method<grpc.testing.Qpstest.StartArgs,
      grpc.testing.Qpstest.Latencies> METHOD_START_TEST =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "StartTest",
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StartArgs.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.Latencies.PARSER));
  private static final io.grpc.stub.Method<grpc.testing.Qpstest.StatsRequest,
      grpc.testing.Qpstest.ServerStats> METHOD_COLLECT_SERVER_STATS =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "CollectServerStats",
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StatsRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.ServerStats.PARSER));
  private static final io.grpc.stub.Method<grpc.testing.Qpstest.SimpleRequest,
      grpc.testing.Qpstest.SimpleResponse> METHOD_UNARY_CALL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "UnaryCall",
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.SimpleRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.SimpleResponse.PARSER));
  private static final io.grpc.stub.Method<grpc.testing.Qpstest.StreamingOutputCallRequest,
      grpc.testing.Qpstest.StreamingOutputCallResponse> METHOD_STREAMING_OUTPUT_CALL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.SERVER_STREAMING, "StreamingOutputCall",
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StreamingOutputCallRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StreamingOutputCallResponse.PARSER));
  private static final io.grpc.stub.Method<grpc.testing.Qpstest.StreamingInputCallRequest,
      grpc.testing.Qpstest.StreamingInputCallResponse> METHOD_STREAMING_INPUT_CALL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.CLIENT_STREAMING, "StreamingInputCall",
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StreamingInputCallRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StreamingInputCallResponse.PARSER));
  private static final io.grpc.stub.Method<grpc.testing.Qpstest.StreamingOutputCallRequest,
      grpc.testing.Qpstest.StreamingOutputCallResponse> METHOD_FULL_DUPLEX_CALL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.DUPLEX_STREAMING, "FullDuplexCall",
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StreamingOutputCallRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StreamingOutputCallResponse.PARSER));
  private static final io.grpc.stub.Method<grpc.testing.Qpstest.StreamingOutputCallRequest,
      grpc.testing.Qpstest.StreamingOutputCallResponse> METHOD_HALF_DUPLEX_CALL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.DUPLEX_STREAMING, "HalfDuplexCall",
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StreamingOutputCallRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(grpc.testing.Qpstest.StreamingOutputCallResponse.PARSER));

  public static TestServiceStub newStub(io.grpc.Channel channel) {
    return new TestServiceStub(channel, CONFIG);
  }

  public static TestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TestServiceBlockingStub(channel, CONFIG);
  }

  public static TestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TestServiceFutureStub(channel, CONFIG);
  }

  public static final TestServiceServiceDescriptor CONFIG =
      new TestServiceServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class TestServiceServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<TestServiceServiceDescriptor> {
    public final io.grpc.MethodDescriptor<grpc.testing.Qpstest.StartArgs,
        grpc.testing.Qpstest.Latencies> startTest;
    public final io.grpc.MethodDescriptor<grpc.testing.Qpstest.StatsRequest,
        grpc.testing.Qpstest.ServerStats> collectServerStats;
    public final io.grpc.MethodDescriptor<grpc.testing.Qpstest.SimpleRequest,
        grpc.testing.Qpstest.SimpleResponse> unaryCall;
    public final io.grpc.MethodDescriptor<grpc.testing.Qpstest.StreamingOutputCallRequest,
        grpc.testing.Qpstest.StreamingOutputCallResponse> streamingOutputCall;
    public final io.grpc.MethodDescriptor<grpc.testing.Qpstest.StreamingInputCallRequest,
        grpc.testing.Qpstest.StreamingInputCallResponse> streamingInputCall;
    public final io.grpc.MethodDescriptor<grpc.testing.Qpstest.StreamingOutputCallRequest,
        grpc.testing.Qpstest.StreamingOutputCallResponse> fullDuplexCall;
    public final io.grpc.MethodDescriptor<grpc.testing.Qpstest.StreamingOutputCallRequest,
        grpc.testing.Qpstest.StreamingOutputCallResponse> halfDuplexCall;

    private TestServiceServiceDescriptor() {
      startTest = createMethodDescriptor(
          "grpc.testing.TestService", METHOD_START_TEST);
      collectServerStats = createMethodDescriptor(
          "grpc.testing.TestService", METHOD_COLLECT_SERVER_STATS);
      unaryCall = createMethodDescriptor(
          "grpc.testing.TestService", METHOD_UNARY_CALL);
      streamingOutputCall = createMethodDescriptor(
          "grpc.testing.TestService", METHOD_STREAMING_OUTPUT_CALL);
      streamingInputCall = createMethodDescriptor(
          "grpc.testing.TestService", METHOD_STREAMING_INPUT_CALL);
      fullDuplexCall = createMethodDescriptor(
          "grpc.testing.TestService", METHOD_FULL_DUPLEX_CALL);
      halfDuplexCall = createMethodDescriptor(
          "grpc.testing.TestService", METHOD_HALF_DUPLEX_CALL);
    }

    @SuppressWarnings("unchecked")
    private TestServiceServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      startTest = (io.grpc.MethodDescriptor<grpc.testing.Qpstest.StartArgs,
          grpc.testing.Qpstest.Latencies>) methodMap.get(
          CONFIG.startTest.getName());
      collectServerStats = (io.grpc.MethodDescriptor<grpc.testing.Qpstest.StatsRequest,
          grpc.testing.Qpstest.ServerStats>) methodMap.get(
          CONFIG.collectServerStats.getName());
      unaryCall = (io.grpc.MethodDescriptor<grpc.testing.Qpstest.SimpleRequest,
          grpc.testing.Qpstest.SimpleResponse>) methodMap.get(
          CONFIG.unaryCall.getName());
      streamingOutputCall = (io.grpc.MethodDescriptor<grpc.testing.Qpstest.StreamingOutputCallRequest,
          grpc.testing.Qpstest.StreamingOutputCallResponse>) methodMap.get(
          CONFIG.streamingOutputCall.getName());
      streamingInputCall = (io.grpc.MethodDescriptor<grpc.testing.Qpstest.StreamingInputCallRequest,
          grpc.testing.Qpstest.StreamingInputCallResponse>) methodMap.get(
          CONFIG.streamingInputCall.getName());
      fullDuplexCall = (io.grpc.MethodDescriptor<grpc.testing.Qpstest.StreamingOutputCallRequest,
          grpc.testing.Qpstest.StreamingOutputCallResponse>) methodMap.get(
          CONFIG.fullDuplexCall.getName());
      halfDuplexCall = (io.grpc.MethodDescriptor<grpc.testing.Qpstest.StreamingOutputCallRequest,
          grpc.testing.Qpstest.StreamingOutputCallResponse>) methodMap.get(
          CONFIG.halfDuplexCall.getName());
    }

    @java.lang.Override
    protected TestServiceServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new TestServiceServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          startTest,
          collectServerStats,
          unaryCall,
          streamingOutputCall,
          streamingInputCall,
          fullDuplexCall,
          halfDuplexCall);
    }
  }

  public static interface TestService {

    public void startTest(grpc.testing.Qpstest.StartArgs request,
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.Latencies> responseObserver);

    public void collectServerStats(grpc.testing.Qpstest.StatsRequest request,
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.ServerStats> responseObserver);

    public void unaryCall(grpc.testing.Qpstest.SimpleRequest request,
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.SimpleResponse> responseObserver);

    public void streamingOutputCall(grpc.testing.Qpstest.StreamingOutputCallRequest request,
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallResponse> responseObserver);

    public io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingInputCallRequest> streamingInputCall(
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingInputCallResponse> responseObserver);

    public io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallRequest> fullDuplexCall(
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallResponse> responseObserver);

    public io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallRequest> halfDuplexCall(
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallResponse> responseObserver);
  }

  public static interface TestServiceBlockingClient {

    public grpc.testing.Qpstest.Latencies startTest(grpc.testing.Qpstest.StartArgs request);

    public grpc.testing.Qpstest.ServerStats collectServerStats(grpc.testing.Qpstest.StatsRequest request);

    public grpc.testing.Qpstest.SimpleResponse unaryCall(grpc.testing.Qpstest.SimpleRequest request);

    public java.util.Iterator<grpc.testing.Qpstest.StreamingOutputCallResponse> streamingOutputCall(
        grpc.testing.Qpstest.StreamingOutputCallRequest request);
  }

  public static interface TestServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<grpc.testing.Qpstest.Latencies> startTest(
        grpc.testing.Qpstest.StartArgs request);

    public com.google.common.util.concurrent.ListenableFuture<grpc.testing.Qpstest.ServerStats> collectServerStats(
        grpc.testing.Qpstest.StatsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<grpc.testing.Qpstest.SimpleResponse> unaryCall(
        grpc.testing.Qpstest.SimpleRequest request);
  }

  public static class TestServiceStub extends
      io.grpc.stub.AbstractStub<TestServiceStub, TestServiceServiceDescriptor>
      implements TestService {
    private TestServiceStub(io.grpc.Channel channel,
        TestServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected TestServiceStub build(io.grpc.Channel channel,
        TestServiceServiceDescriptor config) {
      return new TestServiceStub(channel, config);
    }

    @java.lang.Override
    public void startTest(grpc.testing.Qpstest.StartArgs request,
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.Latencies> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.startTest), request, responseObserver);
    }

    @java.lang.Override
    public void collectServerStats(grpc.testing.Qpstest.StatsRequest request,
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.ServerStats> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.collectServerStats), request, responseObserver);
    }

    @java.lang.Override
    public void unaryCall(grpc.testing.Qpstest.SimpleRequest request,
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.SimpleResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.unaryCall), request, responseObserver);
    }

    @java.lang.Override
    public void streamingOutputCall(grpc.testing.Qpstest.StreamingOutputCallRequest request,
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallResponse> responseObserver) {
      asyncServerStreamingCall(
          channel.newCall(config.streamingOutputCall), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingInputCallRequest> streamingInputCall(
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingInputCallResponse> responseObserver) {
      return asyncClientStreamingCall(
          channel.newCall(config.streamingInputCall), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallRequest> fullDuplexCall(
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallResponse> responseObserver) {
      return duplexStreamingCall(
          channel.newCall(config.fullDuplexCall), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallRequest> halfDuplexCall(
        io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallResponse> responseObserver) {
      return duplexStreamingCall(
          channel.newCall(config.halfDuplexCall), responseObserver);
    }
  }

  public static class TestServiceBlockingStub extends
      io.grpc.stub.AbstractStub<TestServiceBlockingStub, TestServiceServiceDescriptor>
      implements TestServiceBlockingClient {
    private TestServiceBlockingStub(io.grpc.Channel channel,
        TestServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected TestServiceBlockingStub build(io.grpc.Channel channel,
        TestServiceServiceDescriptor config) {
      return new TestServiceBlockingStub(channel, config);
    }

    @java.lang.Override
    public grpc.testing.Qpstest.Latencies startTest(grpc.testing.Qpstest.StartArgs request) {
      return blockingUnaryCall(
          channel.newCall(config.startTest), request);
    }

    @java.lang.Override
    public grpc.testing.Qpstest.ServerStats collectServerStats(grpc.testing.Qpstest.StatsRequest request) {
      return blockingUnaryCall(
          channel.newCall(config.collectServerStats), request);
    }

    @java.lang.Override
    public grpc.testing.Qpstest.SimpleResponse unaryCall(grpc.testing.Qpstest.SimpleRequest request) {
      return blockingUnaryCall(
          channel.newCall(config.unaryCall), request);
    }

    @java.lang.Override
    public java.util.Iterator<grpc.testing.Qpstest.StreamingOutputCallResponse> streamingOutputCall(
        grpc.testing.Qpstest.StreamingOutputCallRequest request) {
      return blockingServerStreamingCall(
          channel.newCall(config.streamingOutputCall), request);
    }
  }

  public static class TestServiceFutureStub extends
      io.grpc.stub.AbstractStub<TestServiceFutureStub, TestServiceServiceDescriptor>
      implements TestServiceFutureClient {
    private TestServiceFutureStub(io.grpc.Channel channel,
        TestServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected TestServiceFutureStub build(io.grpc.Channel channel,
        TestServiceServiceDescriptor config) {
      return new TestServiceFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<grpc.testing.Qpstest.Latencies> startTest(
        grpc.testing.Qpstest.StartArgs request) {
      return unaryFutureCall(
          channel.newCall(config.startTest), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<grpc.testing.Qpstest.ServerStats> collectServerStats(
        grpc.testing.Qpstest.StatsRequest request) {
      return unaryFutureCall(
          channel.newCall(config.collectServerStats), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<grpc.testing.Qpstest.SimpleResponse> unaryCall(
        grpc.testing.Qpstest.SimpleRequest request) {
      return unaryFutureCall(
          channel.newCall(config.unaryCall), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final TestService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.testing.TestService")
      .addMethod(createMethodDefinition(
          METHOD_START_TEST,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                grpc.testing.Qpstest.StartArgs,
                grpc.testing.Qpstest.Latencies>() {
              @java.lang.Override
              public void invoke(
                  grpc.testing.Qpstest.StartArgs request,
                  io.grpc.stub.StreamObserver<grpc.testing.Qpstest.Latencies> responseObserver) {
                serviceImpl.startTest(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_COLLECT_SERVER_STATS,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                grpc.testing.Qpstest.StatsRequest,
                grpc.testing.Qpstest.ServerStats>() {
              @java.lang.Override
              public void invoke(
                  grpc.testing.Qpstest.StatsRequest request,
                  io.grpc.stub.StreamObserver<grpc.testing.Qpstest.ServerStats> responseObserver) {
                serviceImpl.collectServerStats(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_UNARY_CALL,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                grpc.testing.Qpstest.SimpleRequest,
                grpc.testing.Qpstest.SimpleResponse>() {
              @java.lang.Override
              public void invoke(
                  grpc.testing.Qpstest.SimpleRequest request,
                  io.grpc.stub.StreamObserver<grpc.testing.Qpstest.SimpleResponse> responseObserver) {
                serviceImpl.unaryCall(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_STREAMING_OUTPUT_CALL,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                grpc.testing.Qpstest.StreamingOutputCallRequest,
                grpc.testing.Qpstest.StreamingOutputCallResponse>() {
              @java.lang.Override
              public void invoke(
                  grpc.testing.Qpstest.StreamingOutputCallRequest request,
                  io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallResponse> responseObserver) {
                serviceImpl.streamingOutputCall(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_STREAMING_INPUT_CALL,
          asyncStreamingRequestCall(
            new io.grpc.stub.ServerCalls.StreamingRequestMethod<
                grpc.testing.Qpstest.StreamingInputCallRequest,
                grpc.testing.Qpstest.StreamingInputCallResponse>() {
              @java.lang.Override
              public io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingInputCallRequest> invoke(
                  io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingInputCallResponse> responseObserver) {
                return serviceImpl.streamingInputCall(responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_FULL_DUPLEX_CALL,
          asyncStreamingRequestCall(
            new io.grpc.stub.ServerCalls.StreamingRequestMethod<
                grpc.testing.Qpstest.StreamingOutputCallRequest,
                grpc.testing.Qpstest.StreamingOutputCallResponse>() {
              @java.lang.Override
              public io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallRequest> invoke(
                  io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallResponse> responseObserver) {
                return serviceImpl.fullDuplexCall(responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_HALF_DUPLEX_CALL,
          asyncStreamingRequestCall(
            new io.grpc.stub.ServerCalls.StreamingRequestMethod<
                grpc.testing.Qpstest.StreamingOutputCallRequest,
                grpc.testing.Qpstest.StreamingOutputCallResponse>() {
              @java.lang.Override
              public io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallRequest> invoke(
                  io.grpc.stub.StreamObserver<grpc.testing.Qpstest.StreamingOutputCallResponse> responseObserver) {
                return serviceImpl.halfDuplexCall(responseObserver);
              }
            }))).build();
  }
}
