package com.lc.patterns.builder.demo2;

/**
 * @author: L.C
 * @date: 2023/10/31 20:20
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new OfoBuilder();
        Bike bike = builder.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
