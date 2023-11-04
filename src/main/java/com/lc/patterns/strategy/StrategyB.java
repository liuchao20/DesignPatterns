package com.lc.patterns.strategy;

/**
 * @author: L.C
 * @date: 2023/11/4 22:28
 * @description: 具体策略类，封装算法
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("春节，满1000减200，再送价值99元的大礼包。");
    }
}
