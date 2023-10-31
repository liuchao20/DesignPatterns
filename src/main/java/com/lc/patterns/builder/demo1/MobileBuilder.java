package com.lc.patterns.builder.demo1;

/**
 * @author: L.C
 * @date: 2023/10/31 20:05
 * @description: 具体的构建者，构建摩拜单车对象
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
