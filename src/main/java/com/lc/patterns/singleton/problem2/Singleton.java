package com.lc.patterns.singleton.problem2;

import java.io.Serializable;

/**
 * @author: L.C
 * @date: 2023/10/28 14:00
 * @description: 懒汉式：静态内部类
 */
public class Singleton {

    private static boolean flag = false;

    //私有构造方法
    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            //将flag设置为true
            flag = true;
        }
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
