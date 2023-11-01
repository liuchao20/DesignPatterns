package com.lc.patterns.decorator;

/**
 * @author: L.C
 * @date: 2023/11/1 16:16
 * @description: 炒面（具体构建角色）
 */
public class FiredNoodles extends FastFood{

    public FiredNoodles() {
        super(12, "炒面");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
