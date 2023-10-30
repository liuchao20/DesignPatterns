package com.lc.patterns.factory.factory_method;

/**
 * @author: L.C
 * @date: 2023/10/30 1:43
 * @description: 拿铁咖啡工厂：专门生产拿铁咖啡
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
