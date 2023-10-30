package com.lc.patterns.factory.abstract_factory;

/**
 * @author: L.C
 * @date: 2023/10/30 14:40
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //创建意大利风味工厂对象
        //ItalyDessertFactory factory = new ItalyDessertFactory();

        AmericanDessertFactory factory = new AmericanDessertFactory();

        //获取拿铁咖啡、提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
