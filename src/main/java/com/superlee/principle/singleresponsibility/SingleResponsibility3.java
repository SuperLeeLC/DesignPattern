package com.superlee.principle.singleresponsibility;

/**
 * @author : lichao892
 * @date : 2019/10/21 14:10
 * <p>
 * 描述 :    TODO
 */

public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater(("轮船"));
    }

}

/**
 * 1. 这种修改方法没有对原来的类做大的修改，只是增加方法
 * 2. 这里虽然在没有在类这个级别上遵守单一职责原则，但是在方法上仍然遵守
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中运行");
    }
}
