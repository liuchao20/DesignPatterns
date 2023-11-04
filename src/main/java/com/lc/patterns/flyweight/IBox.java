package com.lc.patterns.flyweight;

/**
 * @author: L.C
 * @date: 2023/11/4 21:01
 * @description: I 图形类（具体享元角色）
 */
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
