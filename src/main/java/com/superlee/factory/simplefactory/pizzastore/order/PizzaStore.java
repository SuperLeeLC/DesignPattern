package com.superlee.factory.simplefactory.pizzastore.order;

/**
 * @author : lichao892
 * @date : 2019/10/22 11:31
 * <p>
 * 描述 :    TODO
 */

public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza();

        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
