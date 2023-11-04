package com.lc.patterns.strategy;

/**
 * @author: L.C
 * @date: 2023/11/4 22:34
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //春节来了
        SalesMan salesMan = new SalesMan(new StrategyB());
        //展示促销活动
        salesMan.salesManShow();

        System.out.println("============");
        //中秋节促销活动
        salesMan.setStrategy(new StrategyA());
        salesMan.salesManShow();

        System.out.println("===========");
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();
    }
}
