package com.lc.patterns.factory.factory_method;

/**
 * @author: L.C
 * @date: 2023/10/30 1:49
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
