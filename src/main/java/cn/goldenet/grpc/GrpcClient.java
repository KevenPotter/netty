package cn.goldenet.grpc;

import cn.goldenet.proto.MyRequest;
import cn.goldenet.proto.MyResponse;
import cn.goldenet.proto.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8899).usePlaintext(true).build();
        StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.newBlockingStub(managedChannel);
        MyResponse myResponse = blockingStub.getRealNameByUserName(MyRequest.newBuilder().setUsername("张三").build());
        System.out.println(myResponse.getRealname());
    }
}
