package com.lc.patterns.factory.abstract_factory;

/**
 * @author: L.C
 * @date: 2023/10/30 14:37
 * @description: 意大利风味甜品工厂
 *                  生产 拿铁咖啡、提拉米苏 产品
 */
public class ItalyDessertFactory implements DessertFactory{


    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
