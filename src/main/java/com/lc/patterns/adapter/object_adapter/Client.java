package com.lc.patterns.adapter.object_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 15:04
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());

        System.out.println(msg);

        System.out.println("============");

        //读取TF卡中的数据
        String msg1 = computer.readSD(new SDAdapterTF(new TFCartImpl()));
        System.out.println(msg1);
    }
}
