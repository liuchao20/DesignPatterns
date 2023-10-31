package com.lc.patterns.prototype.test;

import java.io.Serializable;

/**
 * @author: L.C
 * @date: 2023/10/31 15:52
 * @description:
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

