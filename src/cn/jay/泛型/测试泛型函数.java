package cn.jay.泛型;

import java.util.UUID;

public class 测试泛型函数 {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
    }

    public static <T> void sayHello(T t){
        System.out.println("t");
    }

}
