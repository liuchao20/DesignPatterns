package com.lc.patterns.singleton.lazy2;

/**
 * @author: L.C
 * @date: 2023/10/28 10:59
 * @description: 懒汉式：双重检查锁方式
 */
public class Singleton {
    //私有构造方法
    private Singleton() {

    }

    //声明Singleton类型的变量instance
    private static volatile Singleton instance;

    //对外提供访问方式
    public static Singleton getInstance() {
        //第一次判断，如果instance的值不为null，不需要抢占锁，直接返回对象。
        if (instance == null) {
            synchronized (com.lc.patterns.singleton.lazy1.Singleton.class) {
                //第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
