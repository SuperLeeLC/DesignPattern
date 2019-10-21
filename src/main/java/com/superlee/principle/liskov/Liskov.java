package com.superlee.principle.liskov;

/**
 * @author : lichao892
 * @date : 2019/10/21 16:00
 * <p>
 * 描述 :    TODO
 */

public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3+=" + a.func1(11,3));

        System.out.println("-----------------------");

        B b = new B();
        System.out.println("11-3=" + b.func1(11,3));
        System.out.printf("11+3+9=" + b.func2(11,3));
    }
}

class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {
    @Override
    public int func1(int a, int b) {
        return a + b;
    }
    public int func2(int a, int b) {
        return func1(a,b) + 9;
    }
}