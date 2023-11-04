package com.lc.patterns.flyweight;

import java.util.HashMap;

/**
 * @author: L.C
 * @date: 2023/11/4 21:03
 * @description: 工厂类，单例模式
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<String, AbstractBox>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }
    private static BoxFactory boxFactory = new BoxFactory();
    //提供获取该类的静态方法
    public static BoxFactory getInstance(){
        return boxFactory;
    }

    //根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
