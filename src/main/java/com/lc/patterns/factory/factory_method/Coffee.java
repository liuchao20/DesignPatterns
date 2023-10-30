package com.lc.patterns.factory.factory_method;

/**
 * @author: L.C
 * @date: 2023/10/28 17:17
 * @description: 咖啡抽象类
 */
public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    //加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
