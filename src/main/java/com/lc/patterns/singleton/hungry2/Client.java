package com.lc.patterns.singleton.hungry2;

/**
 * @author: L.C
 * @date: 2023/10/28 1:56
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //创建Singleton类的对象
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        //判断获取到的两个实例是否是一个对象
        System.out.println(instance == instance2);
    }
}
