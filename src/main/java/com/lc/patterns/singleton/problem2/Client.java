package com.lc.patterns.singleton.problem2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author: L.C
 * @date: 2023/10/28 14:04
 * @description: 测试使用反射破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //获取字节码对象
        Class<Singleton> clazz = Singleton.class;
        //获取无参构造方法对象
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建单例对象
        Singleton singleton = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();

        //true：没有破坏单例模式
        //false；破坏单例模式
        System.out.println(singleton == singleton2);
    }
}
