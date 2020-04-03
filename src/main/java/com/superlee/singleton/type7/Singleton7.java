package com.superlee.singleton.type7;

/**
 * @author : lichao892
 * @date : 2019/10/21 21:24
 * <p>
 * 描述 :    单例模式 --> 静态内部类  推荐使用
 */

public class Singleton7 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance.hashCode());
    }
}

class Singleton {

    private Singleton(){}

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}