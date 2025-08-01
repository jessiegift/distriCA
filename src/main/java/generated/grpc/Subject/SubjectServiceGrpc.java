package generated.grpc.Subject;

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
 * Subject service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Subject.proto")
public final class SubjectServiceGrpc {

  private SubjectServiceGrpc() {}

  public static final String SERVICE_NAME = "qualityeducation.SubjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.Subject.SubjectPerformance,
      generated.grpc.Subject.SubjectFeedback> getMonitorSubjectPerformanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorSubjectPerformance",
      requestType = generated.grpc.Subject.SubjectPerformance.class,
      responseType = generated.grpc.Subject.SubjectFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.Subject.SubjectPerformance,
      generated.grpc.Subject.SubjectFeedback> getMonitorSubjectPerformanceMethod() {
    io.grpc.MethodDescriptor<generated.grpc.Subject.SubjectPerformance, generated.grpc.Subject.SubjectFeedback> getMonitorSubjectPerformanceMethod;
    if ((getMonitorSubjectPerformanceMethod = SubjectServiceGrpc.getMonitorSubjectPerformanceMethod) == null) {
      synchronized (SubjectServiceGrpc.class) {
        if ((getMonitorSubjectPerformanceMethod = SubjectServiceGrpc.getMonitorSubjectPerformanceMethod) == null) {
          SubjectServiceGrpc.getMonitorSubjectPerformanceMethod = getMonitorSubjectPerformanceMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.Subject.SubjectPerformance, generated.grpc.Subject.SubjectFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "qualityeducation.SubjectService", "MonitorSubjectPerformance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.Subject.SubjectPerformance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.Subject.SubjectFeedback.getDefaultInstance()))
                  .setSchemaDescriptor(new SubjectServiceMethodDescriptorSupplier("MonitorSubjectPerformance"))
                  .build();
          }
        }
     }
     return getMonitorSubjectPerformanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubjectServiceStub newStub(io.grpc.Channel channel) {
    return new SubjectServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubjectServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubjectServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Subject service definition
   * </pre>
   */
  public static abstract class SubjectServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<generated.grpc.Subject.SubjectPerformance> monitorSubjectPerformance(
        io.grpc.stub.StreamObserver<generated.grpc.Subject.SubjectFeedback> responseObserver) {
      return asyncUnimplementedStreamingCall(getMonitorSubjectPerformanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMonitorSubjectPerformanceMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.grpc.Subject.SubjectPerformance,
                generated.grpc.Subject.SubjectFeedback>(
                  this, METHODID_MONITOR_SUBJECT_PERFORMANCE)))
          .build();
    }
  }

  /**
   * <pre>
   * Subject service definition
   * </pre>
   */
  public static final class SubjectServiceStub extends io.grpc.stub.AbstractStub<SubjectServiceStub> {
    private SubjectServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubjectServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubjectServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubjectServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<generated.grpc.Subject.SubjectPerformance> monitorSubjectPerformance(
        io.grpc.stub.StreamObserver<generated.grpc.Subject.SubjectFeedback> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMonitorSubjectPerformanceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Subject service definition
   * </pre>
   */
  public static final class SubjectServiceBlockingStub extends io.grpc.stub.AbstractStub<SubjectServiceBlockingStub> {
    private SubjectServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubjectServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubjectServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubjectServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Subject service definition
   * </pre>
   */
  public static final class SubjectServiceFutureStub extends io.grpc.stub.AbstractStub<SubjectServiceFutureStub> {
    private SubjectServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubjectServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubjectServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubjectServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MONITOR_SUBJECT_PERFORMANCE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubjectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubjectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_SUBJECT_PERFORMANCE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorSubjectPerformance(
              (io.grpc.stub.StreamObserver<generated.grpc.Subject.SubjectFeedback>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SubjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.Subject.SubjectImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubjectService");
    }
  }

  private static final class SubjectServiceFileDescriptorSupplier
      extends SubjectServiceBaseDescriptorSupplier {
    SubjectServiceFileDescriptorSupplier() {}
  }

  private static final class SubjectServiceMethodDescriptorSupplier
      extends SubjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubjectServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubjectServiceFileDescriptorSupplier())
              .addMethod(getMonitorSubjectPerformanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
