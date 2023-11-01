package com.lc.patterns.adapter.object_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 15:00
 * @description: 具体的SD卡类
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello world";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg :" + msg);
    }
}
