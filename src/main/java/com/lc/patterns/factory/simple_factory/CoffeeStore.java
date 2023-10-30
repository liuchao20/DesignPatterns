package com.lc.patterns.factory.simple_factory;

/**
 * @author: L.C
 * @date: 2023/10/28 17:21
 * @description:
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        /*
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        */

        //改进 ：静态工厂
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
