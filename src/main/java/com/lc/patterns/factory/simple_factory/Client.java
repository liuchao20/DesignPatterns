package com.lc.patterns.factory.simple_factory;

/**
 * @author: L.C
 * @date: 2023/10/30 0:22
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店类对象
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());
    }
}
