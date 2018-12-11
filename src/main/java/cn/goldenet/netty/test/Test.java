package cn.goldenet.netty.test;

import io.netty.util.NettyRuntime;
import io.netty.util.internal.SystemPropertyUtil;

public class Test {
    public static void main(String[] args) {
        int result = Math.max(1, SystemPropertyUtil.getInt(
                "io.netty.eventLoopThread", NettyRuntime.availableProcessors() * 2
        ));
        System.out.println(result);
    }
}
