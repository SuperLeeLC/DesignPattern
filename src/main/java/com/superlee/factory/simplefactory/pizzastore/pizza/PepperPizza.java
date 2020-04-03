package com.superlee.factory.simplefactory.pizzastore.pizza;

/**
 * @author : lichao892
 * @date : 2019/10/22 11:19
 * <p>
 * 描述 :    TODO
 */

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作胡椒披萨准备原材料");
    }
}
