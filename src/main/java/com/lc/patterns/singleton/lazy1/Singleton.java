package com.lc.patterns.singleton.lazy1;

/**
 * @author: L.C
 * @date: 2023/10/28 10:59
 * @description: 懒汉式 线程安全问题
 */
public class Singleton {
    //私有构造方法
    private Singleton() {

    }

    //声明Singleton类型的变量instance
    private static Singleton instance;

    //对外提供访问方式
    public static synchronized Singleton getInstance() {

        /*instance = new Singleton();
        return instance;
        */

        if (instance == null) {
            //线程1等待，线程2获取到cpu的执行权，也会进入到该判断里面
            instance = new Singleton();
        }
        return instance;
    }
}
