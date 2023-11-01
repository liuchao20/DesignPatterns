package com.lc.patterns.adapter.object_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 14:58
 * @description: 目标接口
 */
public interface SDCard {
    //从SD卡中读取数据
    String readSD();

    //向SD卡中写入数据
    void writeSD(String msg);
}
