package com.lc.patterns.builder.demo2;

/**
 * @author: L.C
 * @date: 2023/10/31 20:01
 * @description: 抽象构建者类
 */
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    //构建自行车的方法
    public abstract Bike createBike();

    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
