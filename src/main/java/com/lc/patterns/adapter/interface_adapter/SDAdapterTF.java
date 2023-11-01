package com.lc.patterns.adapter.interface_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 15:06
 * @description:
 */
public class SDAdapterTF extends Adapter {
    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        return tfCard.readTF();
    }
}
