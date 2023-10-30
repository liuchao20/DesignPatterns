package com.lc.patterns.singleton.lazy3;

/**
 * @author: L.C
 * @date: 2023/10/28 14:00
 * @description: 懒汉式：静态内部类
 */
public class Singleton {
    //私有构造方法
    private Singleton() {

    }

    //定义一个静态内部类
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
