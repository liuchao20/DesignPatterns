package com.lc.patterns.proxy.static_proxy;

import java.io.Serializable;

/**
 * @author: L.C
 * @date: 2023/10/31 21:32
 * @description: 火车站类
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
