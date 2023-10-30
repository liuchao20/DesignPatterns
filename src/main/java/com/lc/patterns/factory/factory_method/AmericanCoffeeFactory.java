package com.lc.patterns.factory.factory_method;

/**
 * @author: L.C
 * @date: 2023/10/30 1:41
 * @description: 美式咖啡工厂类，专门生产美式咖啡
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
