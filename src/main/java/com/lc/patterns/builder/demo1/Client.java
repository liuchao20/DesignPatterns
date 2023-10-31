package com.lc.patterns.builder.demo1;

/**
 * @author: L.C
 * @date: 2023/10/31 20:14
 * @description: 客户端类
 */
public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        Director director = new Director(new MobileBuilder());
        //指挥者命令开始组装自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
