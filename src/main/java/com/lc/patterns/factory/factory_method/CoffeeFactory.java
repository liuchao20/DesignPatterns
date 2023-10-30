package com.lc.patterns.factory.factory_method;

/**
 * @author: L.C
 * @date: 2023/10/30 1:39
 * @description: CoffeeFactory：抽象工厂
 */
public interface CoffeeFactory {

    //创建Coffee对象的方法
    Coffee createCoffee();
}
