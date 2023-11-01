package com.lc.patterns.decorator;

/**
 * @author: L.C
 * @date: 2023/11/1 16:18
 * @description: 装饰者类（抽象装饰者角色）
 */
public abstract class Garnish extends FastFood{
    //声明快餐类变量
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

}
