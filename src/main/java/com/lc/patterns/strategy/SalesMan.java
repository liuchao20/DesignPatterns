package com.lc.patterns.strategy;

/**
 * @author: L.C
 * @date: 2023/11/4 22:31
 * @description: 促销员 （环境类）
 */
public class SalesMan {

    //聚合策略类对象
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //促销员展示促销活动给用户
    public void salesManShow() {
        strategy.show();
    }
}
