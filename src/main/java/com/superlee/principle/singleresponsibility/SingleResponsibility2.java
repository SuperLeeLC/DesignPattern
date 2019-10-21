package com.superlee.principle.singleresponsibility;

/**
 * @author : lichao892
 * @date : 2019/10/21 14:03
 * <p>
 * 描述 :    TODO
 */

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }

}

/**
 * 1. 遵守单一职责原则
 * 2. 但是这样做的改动很大，即将类分解，同时修改客户端
 * 3. 改进：直接修改 Vehicle 类，改动代码比较少-->方案3
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}
