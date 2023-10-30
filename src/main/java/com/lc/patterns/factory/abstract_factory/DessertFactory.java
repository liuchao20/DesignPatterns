package com.lc.patterns.factory.abstract_factory;

/**
 * @author: L.C
 * @date: 2023/10/30 14:34
 * @description:
 */
public interface DessertFactory {

    //生产咖啡的功能
    Coffee createCoffee();

    //生产甜品的功能
    Dessert createDessert();

}
