package cn.goldenet.protobuf;

public class ProtoBufTest {
    public static void main(String[] args) throws Exception {
        // 利用protobuf构建器生成对象
        DataInfo.Student student = DataInfo.Student.newBuilder().setName("张三").setAge(20).setAddress("北京").build();
        // 把上述对象转换为字节数组
        byte[] student2ByteArray = student.toByteArray();
        // 再把其从字节数组反序列化出来
        DataInfo.Student student2 = DataInfo.Student.parseFrom(student2ByteArray);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getAddress());
    }
}
