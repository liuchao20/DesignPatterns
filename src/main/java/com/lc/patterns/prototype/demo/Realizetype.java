package com.lc.patterns.prototype.demo;

/**
 * @author: L.C
 * @date: 2023/10/30 15:51
 * @description:
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体原型对象创建完成！");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
