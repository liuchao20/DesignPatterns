package com.lc.patterns.flyweight;

/**
 * @author: L.C
 * @date: 2023/11/4 21:11
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        AbstractBox i = factory.getShape("I");
        i.display("red");

        AbstractBox l = factory.getShape("L");
        l.display("green");

        AbstractBox o = factory.getShape("O");
        o.display("blue");

        AbstractBox o2 = factory.getShape("O");
        o2.display("red");

        System.out.println("两次获取到的O图形对象是否是同一个对象：" + (o==o2));
    }
}
