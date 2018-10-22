package cn.goldenet.grpc;

import cn.goldenet.proto.MyRequest;
import cn.goldenet.proto.MyResponse;
import cn.goldenet.proto.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {
    @Override
    public void getRealNameByUserName(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("接收到客户端信息" + request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname("张三").build());
        responseObserver.onCompleted();
    }
}
