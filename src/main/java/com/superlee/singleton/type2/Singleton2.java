package com.superlee.singleton.type2;

/**
 * @author : lichao892
 * @date : 2019/10/21 21:02
 * <p>
 * 描述 :    单例模式 --> 饿汉式 (静态代码块)
 */

public class Singleton2 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance.hashCode());
    }
}

class Singleton {
    //1. 构造器私有化，外部不能new
    private Singleton() {}

    //2. 本类的内部创建对象实例
    private static Singleton instance;

    //在静态代码块中创建单例对象
    static {
        instance = new Singleton();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
