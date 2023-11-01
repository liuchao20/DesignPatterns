package com.lc.patterns.adapter.interface_adapter;

/**
 * @author: L.C
 * @date: 2023/11/1 15:35
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDAdapterTF(new TFCartImpl()));
        System.out.println(msg);
    }
}
