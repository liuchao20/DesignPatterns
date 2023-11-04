package com.lc.patterns.flyweight;

/**
 * @author: L.C
 * @date: 2023/11/4 20:58
 * @description: 抽象享元角色
 */
public abstract class AbstractBox {

    //获取图形
    public abstract String getShape();

    //显示图形及颜色
    public void display(String color){
        System.out.println("方块形状：" + getShape() + "," + color);
    }
}
