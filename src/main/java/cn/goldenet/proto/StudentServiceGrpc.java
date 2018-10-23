package cn.goldenet.proto;

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
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.15.1)",
        comments = "Source: Student.proto")
public final class StudentServiceGrpc {

  public static final String SERVICE_NAME = "cn.goldenet.proto.StudentService";
  private static final int METHODID_GET_REAL_NAME_BY_USER_NAME = 0;
  private static final int METHODID_GET_STUDENTS_BY_AGE = 1;
  private static final int METHODID_GET_STUDENTS_WRAPPER_BY_AGES = 2;
  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cn.goldenet.proto.MyRequest,
          cn.goldenet.proto.MyResponse> getGetRealNameByUserNameMethod;
  private static volatile io.grpc.MethodDescriptor<cn.goldenet.proto.StudentRequest,
          cn.goldenet.proto.StudentResponse> getGetStudentsByAgeMethod;
  private static volatile io.grpc.MethodDescriptor<cn.goldenet.proto.StudentRequest,
          cn.goldenet.proto.StudentResponseList> getGetStudentsWrapperByAgesMethod;
  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  private StudentServiceGrpc() {
  }

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetRealNameByUserName",
          requestType = cn.goldenet.proto.MyRequest.class,
          responseType = cn.goldenet.proto.MyResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.goldenet.proto.MyRequest,
          cn.goldenet.proto.MyResponse> getGetRealNameByUserNameMethod() {
    io.grpc.MethodDescriptor<cn.goldenet.proto.MyRequest, cn.goldenet.proto.MyResponse> getGetRealNameByUserNameMethod;
    if ((getGetRealNameByUserNameMethod = StudentServiceGrpc.getGetRealNameByUserNameMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetRealNameByUserNameMethod = StudentServiceGrpc.getGetRealNameByUserNameMethod) == null) {
          StudentServiceGrpc.getGetRealNameByUserNameMethod = getGetRealNameByUserNameMethod =
                  io.grpc.MethodDescriptor.<cn.goldenet.proto.MyRequest, cn.goldenet.proto.MyResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(
                                  "cn.goldenet.proto.StudentService", "GetRealNameByUserName"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  cn.goldenet.proto.MyRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  cn.goldenet.proto.MyResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetRealNameByUserName"))
                          .build();
        }
      }
    }
    return getGetRealNameByUserNameMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetStudentsByAge",
          requestType = cn.goldenet.proto.StudentRequest.class,
          responseType = cn.goldenet.proto.StudentResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cn.goldenet.proto.StudentRequest,
          cn.goldenet.proto.StudentResponse> getGetStudentsByAgeMethod() {
    io.grpc.MethodDescriptor<cn.goldenet.proto.StudentRequest, cn.goldenet.proto.StudentResponse> getGetStudentsByAgeMethod;
    if ((getGetStudentsByAgeMethod = StudentServiceGrpc.getGetStudentsByAgeMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentsByAgeMethod = StudentServiceGrpc.getGetStudentsByAgeMethod) == null) {
          StudentServiceGrpc.getGetStudentsByAgeMethod = getGetStudentsByAgeMethod =
                  io.grpc.MethodDescriptor.<cn.goldenet.proto.StudentRequest, cn.goldenet.proto.StudentResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                          .setFullMethodName(generateFullMethodName(
                                  "cn.goldenet.proto.StudentService", "GetStudentsByAge"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  cn.goldenet.proto.StudentRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  cn.goldenet.proto.StudentResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentsByAge"))
                          .build();
        }
      }
    }
    return getGetStudentsByAgeMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetStudentsWrapperByAges",
          requestType = cn.goldenet.proto.StudentRequest.class,
          responseType = cn.goldenet.proto.StudentResponseList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<cn.goldenet.proto.StudentRequest,
          cn.goldenet.proto.StudentResponseList> getGetStudentsWrapperByAgesMethod() {
    io.grpc.MethodDescriptor<cn.goldenet.proto.StudentRequest, cn.goldenet.proto.StudentResponseList> getGetStudentsWrapperByAgesMethod;
    if ((getGetStudentsWrapperByAgesMethod = StudentServiceGrpc.getGetStudentsWrapperByAgesMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentsWrapperByAgesMethod = StudentServiceGrpc.getGetStudentsWrapperByAgesMethod) == null) {
          StudentServiceGrpc.getGetStudentsWrapperByAgesMethod = getGetStudentsWrapperByAgesMethod =
                  io.grpc.MethodDescriptor.<cn.goldenet.proto.StudentRequest, cn.goldenet.proto.StudentResponseList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
                          .setFullMethodName(generateFullMethodName(
                                  "cn.goldenet.proto.StudentService", "GetStudentsWrapperByAges"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  cn.goldenet.proto.StudentRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  cn.goldenet.proto.StudentResponseList.getDefaultInstance()))
                          .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentsWrapperByAges"))
                          .build();
        }
      }
    }
    return getGetStudentsWrapperByAgesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
          io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
                  .addMethod(getGetRealNameByUserNameMethod())
                  .addMethod(getGetStudentsByAgeMethod())
                  .addMethod(getGetStudentsWrapperByAgesMethod())
                  .build();
        }
      }
    }
    return result;
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealNameByUserName(cn.goldenet.proto.MyRequest request,
                                      io.grpc.stub.StreamObserver<cn.goldenet.proto.MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealNameByUserNameMethod(), responseObserver);
    }

    /**
     */
    public void getStudentsByAge(cn.goldenet.proto.StudentRequest request,
                                 io.grpc.stub.StreamObserver<cn.goldenet.proto.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentsByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<cn.goldenet.proto.StudentRequest> getStudentsWrapperByAges(
            io.grpc.stub.StreamObserver<cn.goldenet.proto.StudentResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetStudentsWrapperByAgesMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getGetRealNameByUserNameMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      cn.goldenet.proto.MyRequest,
                                      cn.goldenet.proto.MyResponse>(
                                      this, METHODID_GET_REAL_NAME_BY_USER_NAME)))
              .addMethod(
                      getGetStudentsByAgeMethod(),
                      asyncServerStreamingCall(
                              new MethodHandlers<
                                      cn.goldenet.proto.StudentRequest,
                                      cn.goldenet.proto.StudentResponse>(
                                      this, METHODID_GET_STUDENTS_BY_AGE)))
              .addMethod(
                      getGetStudentsWrapperByAgesMethod(),
                      asyncBidiStreamingCall(
                              new MethodHandlers<
                                      cn.goldenet.proto.StudentRequest,
                                      cn.goldenet.proto.StudentResponseList>(
                                      this, METHODID_GET_STUDENTS_WRAPPER_BY_AGES)))
              .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
                               io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(io.grpc.Channel channel,
                                       io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealNameByUserName(cn.goldenet.proto.MyRequest request,
                                      io.grpc.stub.StreamObserver<cn.goldenet.proto.MyResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetRealNameByUserNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentsByAge(cn.goldenet.proto.StudentRequest request,
                                 io.grpc.stub.StreamObserver<cn.goldenet.proto.StudentResponse> responseObserver) {
      asyncServerStreamingCall(
              getChannel().newCall(getGetStudentsByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<cn.goldenet.proto.StudentRequest> getStudentsWrapperByAges(
            io.grpc.stub.StreamObserver<cn.goldenet.proto.StudentResponseList> responseObserver) {
      return asyncBidiStreamingCall(
              getChannel().newCall(getGetStudentsWrapperByAgesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
                                       io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
                                               io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cn.goldenet.proto.MyResponse getRealNameByUserName(cn.goldenet.proto.MyRequest request) {
      return blockingUnaryCall(
              getChannel(), getGetRealNameByUserNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cn.goldenet.proto.StudentResponse> getStudentsByAge(
            cn.goldenet.proto.StudentRequest request) {
      return blockingServerStreamingCall(
              getChannel(), getGetStudentsByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
                                     io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
                                             io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.goldenet.proto.MyResponse> getRealNameByUserName(
            cn.goldenet.proto.MyRequest request) {
      return futureUnaryCall(
              getChannel().newCall(getGetRealNameByUserNameMethod(), getCallOptions()), request);
    }
  }

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME_BY_USER_NAME:
          serviceImpl.getRealNameByUserName((cn.goldenet.proto.MyRequest) request,
                  (io.grpc.stub.StreamObserver<cn.goldenet.proto.MyResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_BY_AGE:
          serviceImpl.getStudentsByAge((cn.goldenet.proto.StudentRequest) request,
                  (io.grpc.stub.StreamObserver<cn.goldenet.proto.StudentResponse>) responseObserver);
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
        case METHODID_GET_STUDENTS_WRAPPER_BY_AGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getStudentsWrapperByAges(
                  (io.grpc.stub.StreamObserver<cn.goldenet.proto.StudentResponseList>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cn.goldenet.proto.StudentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
          extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {
    }
  }

  private static final class StudentServiceMethodDescriptorSupplier
          extends StudentServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }
}
