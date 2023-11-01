package com.lc.patterns.decorator;

/**
 * @author: L.C
 * @date: 2023/11/1 16:21
 * @description: 鸡蛋类（具体装饰者角色）
 */
public class Egg extends Garnish{
    public Egg(FastFood fastFood){
        super(fastFood, 1, "鸡蛋");
    }
    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
