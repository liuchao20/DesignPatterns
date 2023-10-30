package com.lc.patterns.singleton.lazy1;

/**
 * @author: L.C
 * @date: 2023/10/28 11:13
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
