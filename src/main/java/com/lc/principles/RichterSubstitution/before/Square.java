package com.lc.principles.RichterSubstitution.before;

/**
 * @author: L.C
 * @date: 2023/10/27 23:00
 * @description: 正方形类
 */
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
