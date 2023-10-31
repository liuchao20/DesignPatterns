package com.lc.patterns.builder.demo1;

/**
 * @author: L.C
 * @date: 2023/10/31 19:58
 * @description: 产品类
 */
public class Bike {
    //车架
    private String frame;

    //车座
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }


}
