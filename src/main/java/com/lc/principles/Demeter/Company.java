package com.lc.principles.Demeter;

/**
 * @author: L.C
 * @date: 2023/10/28 1:09
 * @description: 媒体公司类
 */
public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
