package com.lc.patterns.adapter.interface_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 14:55
 * @description: 适配者类
 */
public class TFCartImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello world";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg :" + msg);
    }
}
