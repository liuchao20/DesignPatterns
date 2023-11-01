package com.lc.patterns.adapter.object_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 15:06
 * @description:
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
