package com.lc.patterns.singleton.lazy2;

/**
 * @author: L.C
 * @date: 2023/10/28 11:35
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
    }
}
