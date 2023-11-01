package com.lc.patterns.adapter.interface_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 15:28
 * @description:
 */
public abstract class Adapter implements SDCard{

    @Override
    public String readSD() {
        return null;
    }

    @Override
    public void writeSD(String msg) {

    }
}
