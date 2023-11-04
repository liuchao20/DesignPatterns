package com.lc.patterns.flyweight;

/**
 * @author: L.C
 * @date: 2023/11/4 21:02
 * @description: O 图形类（具体享元角色）
 */
public class OBox extends AbstractBox{
    @Override
    public String getShape() {
        return "O";
    }
}
