package com.superlee.factory.simplefactory.pizzastore.order;

import com.superlee.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.superlee.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.superlee.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64.Encoder;
/**
 * @author : lichao892
 * @date : 2019/10/22 11:22
 * <p>
 * 描述 :    TODO
 */

public class OrderPizza {

    //    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            } else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//
//        } while (true);
//    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";

        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.box();
            } else {
                System.out.println("订购披萨失败！");
                break;
            }
        } while (true);
    }

    private String getType() {
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

