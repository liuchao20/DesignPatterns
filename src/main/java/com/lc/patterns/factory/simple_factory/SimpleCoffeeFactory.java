package com.lc.patterns.factory.simple_factory;

/**
 * @author: L.C
 * @date: 2023/10/30 0:16
 * @description: 简单咖啡工厂类，用来生产咖啡
 */

//改进 加static
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        //声明Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，你所点的咖啡没有");
        }
        return coffee;
    }
}
