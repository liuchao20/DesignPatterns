package com.lc.patterns.builder.demo1;

/**
 * @author: L.C
 * @date: 2023/10/31 20:09
 * @description: ofo单车构建者，用来构建ofo单车对象
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
