package com.lc.principles.Demeter;

/**
 * @author: L.C
 * @date: 2023/10/28 1:08
 * @description: 粉丝类
 */
public class Fans {
    private String name;

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
