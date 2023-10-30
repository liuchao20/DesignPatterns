package com.lc.patterns.factory.abstract_factory;

/**
 * @author: L.C
 * @date: 2023/10/30 14:35
 * @description: 美式风味的甜品工厂
 *                  生产 美式咖啡、抹茶慕斯 产品
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }

}
