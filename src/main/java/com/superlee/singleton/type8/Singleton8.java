package com.superlee.singleton.type8;

/**
 * @author : lichao892
 * @date : 2019/10/22 10:43
 * <p>
 * 描述 :    TODO
 */

public class Singleton8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance.hashCode());
    }
}

enum Singleton {
    INSTANCE;
    public void sayOk() {
        System.out.println("OK");
    }
}
