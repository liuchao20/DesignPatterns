package com.lc.patterns.strategy;

/**
 * @author: L.C
 * @date: 2023/11/4 22:28
 * @description: 具体策略类，封装算法
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
