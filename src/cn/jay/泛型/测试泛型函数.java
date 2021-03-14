package cn.jay.泛型;

public class 测试泛型函数 {

    public static void main(String[] args) {
	// write your code here
        sayHello("hello");
    }

    public static <T> void sayHello(T t){
        System.out.println("t");
    }

}
