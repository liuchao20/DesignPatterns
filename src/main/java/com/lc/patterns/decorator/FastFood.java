package com.lc.patterns.decorator;

/**
 * @author: L.C
 * @date: 2023/11/1 16:09
 * @description: 快餐类 : 抽象构件（Component）角色
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "FastFood{" +
                "price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }

    public abstract float cost();
}
