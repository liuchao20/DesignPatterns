package com.lc.patterns.singleton.evil;

/**
 * @author: L.C
 * @date: 2023/10/28 14:12
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance == instance2);
    }
}
