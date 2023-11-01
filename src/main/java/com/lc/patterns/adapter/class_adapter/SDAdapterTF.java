package com.lc.patterns.adapter.class_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 15:06
 * @description:
 */
public class SDAdapterTF extends TFCartImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
