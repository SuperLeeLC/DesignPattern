package com.superlee.factory.simplefactory.pizzastore.pizza;

/**
 * @author : lichao892
 * @date : 2019/10/22 11:15
 * <p>
 * 描述 :    TODO
 */

public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking");
    }

    public void cut() {
        System.out.println(name + " cutting");
    }

    public void box() {
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
