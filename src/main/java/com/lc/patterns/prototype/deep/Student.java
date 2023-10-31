package com.lc.patterns.prototype.deep;

import java.io.Serializable;

/**
 * @author: L.C
 * @date: 2023/10/31 15:52
 * @description:
 */
public class Student implements Serializable {
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

