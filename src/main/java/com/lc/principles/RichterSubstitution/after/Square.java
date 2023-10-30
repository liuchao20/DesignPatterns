package com.lc.principles.RichterSubstitution.after;

/**
 * @author: L.C
 * @date: 2023/10/27 23:42
 * @description: 正方形类
 */
public class Square implements Quadrilateral {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
