package com.lc.patterns.adapter.interface_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 15:01
 * @description:
 */
public class Computer {
    public String readSD(SDCard sdCard){
        if (sdCard == null){
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
