package com.lc.patterns.prototype.demo;

/**
 * @author: L.C
 * @date: 2023/10/30 15:55
 * @description:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型对象
        Realizetype realizetype = new Realizetype();

        //调用原型类中的clone方法
        Realizetype clone = realizetype.clone();

        System.out.println("具体对象和克隆出来的是否是同一个对象？" + (realizetype == clone));
    }
}
