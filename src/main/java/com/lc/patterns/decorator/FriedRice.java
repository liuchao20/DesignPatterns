package com.lc.patterns.decorator;

/**
 * @author: L.C
 * @date: 2023/11/1 16:13
 * @description: 炒饭（具体构件角色）
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10, "炒饭");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
