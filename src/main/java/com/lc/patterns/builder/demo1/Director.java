package com.lc.patterns.builder.demo1;

/**
 * @author: L.C
 * @date: 2023/10/31 20:11
 * @description: 指挥者类
 */
public class Director {
    //声明Builder类型的变量
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
