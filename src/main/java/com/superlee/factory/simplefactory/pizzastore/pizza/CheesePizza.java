package com.superlee.factory.simplefactory.pizzastore.pizza;

/**
 * @author : lichao892
 * @date : 2019/10/22 11:19
 * <p>
 * 描述 :    TODO
 */

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
