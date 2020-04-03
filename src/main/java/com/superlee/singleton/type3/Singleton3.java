package com.superlee.singleton.type3;

/**
 * @author : lichao892
 * @date : 2019/10/21 21:24
 * <p>
 * 描述 :    单例模式 --> 懒汉式（线程不安全）
 */

public class Singleton3 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton(){}

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才去创建instance，即懒汉式
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}