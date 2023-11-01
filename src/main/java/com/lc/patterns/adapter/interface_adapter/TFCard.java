package com.lc.patterns.adapter.interface_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 14:51
 * @description: 适配者类的接口
 */
public interface TFCard {
    //从TF卡中读取数据
    String readTF();

    //向TF卡中写入数据
    void writeTF(String msg);
}
