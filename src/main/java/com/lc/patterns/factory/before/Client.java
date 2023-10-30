package com.lc.patterns.factory.before;

/**
 * @author: L.C
 * @date: 2023/10/28 17:25
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());
    }
}
