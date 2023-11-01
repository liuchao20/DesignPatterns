package com.lc.patterns.proxy.static_proxy;

/**
 * @author: L.C
 * @date: 2023/10/31 21:32
 * @description: 代售点类
 */
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
