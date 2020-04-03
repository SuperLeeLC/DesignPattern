package com.superlee.factory.simplefactory.pizzastore.order;

import com.superlee.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.superlee.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.superlee.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.superlee.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author : lichao892
 * @date : 2019/10/22 11:51
 * <p>
 * 描述 :    TODO
 */

public class SimpleFactory {

    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
