package com.lc.patterns.factory.config_factory;

/**
 * @author: L.C
 * @date: 2023/10/30 15:22
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");

        System.out.println(american.getName());

        System.out.println("==============");

        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());

    }
}
