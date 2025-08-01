package generated.grpc.CareerPath;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * CareerPath service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CareerPath.proto")
public final class CareerPathServiceGrpc {

  private CareerPathServiceGrpc() {}

  public static final String SERVICE_NAME = "qualityeducation.CareerPathService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.CareerPath.CareerPathRequest,
      generated.grpc.CareerPath.CareerPathResponse> getSuggestCareerPathsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestCareerPaths",
      requestType = generated.grpc.CareerPath.CareerPathRequest.class,
      responseType = generated.grpc.CareerPath.CareerPathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.CareerPath.CareerPathRequest,
      generated.grpc.CareerPath.CareerPathResponse> getSuggestCareerPathsMethod() {
    io.grpc.MethodDescriptor<generated.grpc.CareerPath.CareerPathRequest, generated.grpc.CareerPath.CareerPathResponse> getSuggestCareerPathsMethod;
    if ((getSuggestCareerPathsMethod = CareerPathServiceGrpc.getSuggestCareerPathsMethod) == null) {
      synchronized (CareerPathServiceGrpc.class) {
        if ((getSuggestCareerPathsMethod = CareerPathServiceGrpc.getSuggestCareerPathsMethod) == null) {
          CareerPathServiceGrpc.getSuggestCareerPathsMethod = getSuggestCareerPathsMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.CareerPath.CareerPathRequest, generated.grpc.CareerPath.CareerPathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "qualityeducation.CareerPathService", "SuggestCareerPaths"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CareerPath.CareerPathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CareerPath.CareerPathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CareerPathServiceMethodDescriptorSupplier("SuggestCareerPaths"))
                  .build();
          }
        }
     }
     return getSuggestCareerPathsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CareerPathServiceStub newStub(io.grpc.Channel channel) {
    return new CareerPathServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CareerPathServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CareerPathServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CareerPathServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CareerPathServiceFutureStub(channel);
  }

  /**
   * <pre>
   * CareerPath service definition
   * </pre>
   */
  public static abstract class CareerPathServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void suggestCareerPaths(generated.grpc.CareerPath.CareerPathRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.CareerPath.CareerPathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSuggestCareerPathsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSuggestCareerPathsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.grpc.CareerPath.CareerPathRequest,
                generated.grpc.CareerPath.CareerPathResponse>(
                  this, METHODID_SUGGEST_CAREER_PATHS)))
          .build();
    }
  }

  /**
   * <pre>
   * CareerPath service definition
   * </pre>
   */
  public static final class CareerPathServiceStub extends io.grpc.stub.AbstractStub<CareerPathServiceStub> {
    private CareerPathServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CareerPathServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CareerPathServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CareerPathServiceStub(channel, callOptions);
    }

    /**
     */
    public void suggestCareerPaths(generated.grpc.CareerPath.CareerPathRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.CareerPath.CareerPathResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSuggestCareerPathsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * CareerPath service definition
   * </pre>
   */
  public static final class CareerPathServiceBlockingStub extends io.grpc.stub.AbstractStub<CareerPathServiceBlockingStub> {
    private CareerPathServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CareerPathServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CareerPathServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CareerPathServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<generated.grpc.CareerPath.CareerPathResponse> suggestCareerPaths(
        generated.grpc.CareerPath.CareerPathRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSuggestCareerPathsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * CareerPath service definition
   * </pre>
   */
  public static final class CareerPathServiceFutureStub extends io.grpc.stub.AbstractStub<CareerPathServiceFutureStub> {
    private CareerPathServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CareerPathServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CareerPathServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CareerPathServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SUGGEST_CAREER_PATHS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CareerPathServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CareerPathServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUGGEST_CAREER_PATHS:
          serviceImpl.suggestCareerPaths((generated.grpc.CareerPath.CareerPathRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.CareerPath.CareerPathResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CareerPathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CareerPathServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.CareerPath.CareerPathImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CareerPathService");
    }
  }

  private static final class CareerPathServiceFileDescriptorSupplier
      extends CareerPathServiceBaseDescriptorSupplier {
    CareerPathServiceFileDescriptorSupplier() {}
  }

  private static final class CareerPathServiceMethodDescriptorSupplier
      extends CareerPathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CareerPathServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CareerPathServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CareerPathServiceFileDescriptorSupplier())
              .addMethod(getSuggestCareerPathsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
