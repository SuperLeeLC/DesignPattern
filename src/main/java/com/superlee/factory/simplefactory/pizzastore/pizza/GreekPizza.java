package com.superlee.factory.simplefactory.pizzastore.pizza;

/**
 * @author : lichao892
 * @date : 2019/10/22 11:20
 * <p>
 * 描述 :    TODO
 */

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作希腊披萨准备原材料");
    }
}
