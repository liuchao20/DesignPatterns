package com.lc.patterns.builder.demo3;

/**
 * @author: L.C
 * @date: 2023/10/31 20:49
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("骁龙8Gen3")
                .memory("sandisk")
                .mainboard("xiaomi")
                .screen("三星")
                .build();

        System.out.println(phone.toString());
    }
}
