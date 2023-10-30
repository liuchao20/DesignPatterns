package com.lc.principles.Demeter;

/**
 * @author: L.C
 * @date: 2023/10/28 1:07
 * @description: 明星类
 */
public class Star {

    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
