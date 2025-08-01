package generated.grpc.GradeReport;

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
 * GradeReport service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: GradeReport.proto")
public final class GradeReportServiceGrpc {

  private GradeReportServiceGrpc() {}

  public static final String SERVICE_NAME = "qualityeducation.GradeReportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.GradeReport.GradeReportRequest,
      generated.grpc.GradeReport.GradeReportResponse> getGetGradeReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGradeReport",
      requestType = generated.grpc.GradeReport.GradeReportRequest.class,
      responseType = generated.grpc.GradeReport.GradeReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.GradeReport.GradeReportRequest,
      generated.grpc.GradeReport.GradeReportResponse> getGetGradeReportMethod() {
    io.grpc.MethodDescriptor<generated.grpc.GradeReport.GradeReportRequest, generated.grpc.GradeReport.GradeReportResponse> getGetGradeReportMethod;
    if ((getGetGradeReportMethod = GradeReportServiceGrpc.getGetGradeReportMethod) == null) {
      synchronized (GradeReportServiceGrpc.class) {
        if ((getGetGradeReportMethod = GradeReportServiceGrpc.getGetGradeReportMethod) == null) {
          GradeReportServiceGrpc.getGetGradeReportMethod = getGetGradeReportMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.GradeReport.GradeReportRequest, generated.grpc.GradeReport.GradeReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "qualityeducation.GradeReportService", "GetGradeReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.GradeReport.GradeReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.GradeReport.GradeReportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GradeReportServiceMethodDescriptorSupplier("GetGradeReport"))
                  .build();
          }
        }
     }
     return getGetGradeReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.GradeReport.AssessmentScore,
      generated.grpc.GradeReport.GradeReportResponse> getPredictFinalGradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PredictFinalGrade",
      requestType = generated.grpc.GradeReport.AssessmentScore.class,
      responseType = generated.grpc.GradeReport.GradeReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.GradeReport.AssessmentScore,
      generated.grpc.GradeReport.GradeReportResponse> getPredictFinalGradeMethod() {
    io.grpc.MethodDescriptor<generated.grpc.GradeReport.AssessmentScore, generated.grpc.GradeReport.GradeReportResponse> getPredictFinalGradeMethod;
    if ((getPredictFinalGradeMethod = GradeReportServiceGrpc.getPredictFinalGradeMethod) == null) {
      synchronized (GradeReportServiceGrpc.class) {
        if ((getPredictFinalGradeMethod = GradeReportServiceGrpc.getPredictFinalGradeMethod) == null) {
          GradeReportServiceGrpc.getPredictFinalGradeMethod = getPredictFinalGradeMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.GradeReport.AssessmentScore, generated.grpc.GradeReport.GradeReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "qualityeducation.GradeReportService", "PredictFinalGrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.GradeReport.AssessmentScore.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.GradeReport.GradeReportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GradeReportServiceMethodDescriptorSupplier("PredictFinalGrade"))
                  .build();
          }
        }
     }
     return getPredictFinalGradeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GradeReportServiceStub newStub(io.grpc.Channel channel) {
    return new GradeReportServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GradeReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GradeReportServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GradeReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GradeReportServiceFutureStub(channel);
  }

  /**
   * <pre>
   * GradeReport service definition
   * </pre>
   */
  public static abstract class GradeReportServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void getGradeReport(generated.grpc.GradeReport.GradeReportRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.GradeReport.GradeReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGradeReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.GradeReport.AssessmentScore> predictFinalGrade(
        io.grpc.stub.StreamObserver<generated.grpc.GradeReport.GradeReportResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPredictFinalGradeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGradeReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.GradeReport.GradeReportRequest,
                generated.grpc.GradeReport.GradeReportResponse>(
                  this, METHODID_GET_GRADE_REPORT)))
          .addMethod(
            getPredictFinalGradeMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                generated.grpc.GradeReport.AssessmentScore,
                generated.grpc.GradeReport.GradeReportResponse>(
                  this, METHODID_PREDICT_FINAL_GRADE)))
          .build();
    }
  }

  /**
   * <pre>
   * GradeReport service definition
   * </pre>
   */
  public static final class GradeReportServiceStub extends io.grpc.stub.AbstractStub<GradeReportServiceStub> {
    private GradeReportServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GradeReportServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradeReportServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GradeReportServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void getGradeReport(generated.grpc.GradeReport.GradeReportRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.GradeReport.GradeReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGradeReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.GradeReport.AssessmentScore> predictFinalGrade(
        io.grpc.stub.StreamObserver<generated.grpc.GradeReport.GradeReportResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPredictFinalGradeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * GradeReport service definition
   * </pre>
   */
  public static final class GradeReportServiceBlockingStub extends io.grpc.stub.AbstractStub<GradeReportServiceBlockingStub> {
    private GradeReportServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GradeReportServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradeReportServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GradeReportServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public generated.grpc.GradeReport.GradeReportResponse getGradeReport(generated.grpc.GradeReport.GradeReportRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGradeReportMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * GradeReport service definition
   * </pre>
   */
  public static final class GradeReportServiceFutureStub extends io.grpc.stub.AbstractStub<GradeReportServiceFutureStub> {
    private GradeReportServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GradeReportServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradeReportServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GradeReportServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.GradeReport.GradeReportResponse> getGradeReport(
        generated.grpc.GradeReport.GradeReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGradeReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GRADE_REPORT = 0;
  private static final int METHODID_PREDICT_FINAL_GRADE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GradeReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GradeReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GRADE_REPORT:
          serviceImpl.getGradeReport((generated.grpc.GradeReport.GradeReportRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.GradeReport.GradeReportResponse>) responseObserver);
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
        case METHODID_PREDICT_FINAL_GRADE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.predictFinalGrade(
              (io.grpc.stub.StreamObserver<generated.grpc.GradeReport.GradeReportResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GradeReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GradeReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.GradeReport.GradeReportImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GradeReportService");
    }
  }

  private static final class GradeReportServiceFileDescriptorSupplier
      extends GradeReportServiceBaseDescriptorSupplier {
    GradeReportServiceFileDescriptorSupplier() {}
  }

  private static final class GradeReportServiceMethodDescriptorSupplier
      extends GradeReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GradeReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GradeReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GradeReportServiceFileDescriptorSupplier())
              .addMethod(getGetGradeReportMethod())
              .addMethod(getPredictFinalGradeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
