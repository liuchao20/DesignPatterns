package com.lc.patterns.decorator;

/**
 * @author: L.C
 * @date: 2023/11/1 16:26
 * @description: 培根类（具体装饰者角色）
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood){
        super(fastFood, 2, "培根");
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
