package com.lc.patterns.prototype.test;

import java.io.Serializable;

/**
 * @author: L.C
 * @date: 2023/10/30 16:45
 * @description:
 */
public class Citation implements Cloneable {

    /*
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    */

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }


    public void show() {
        System.out.println(stu.getName() + "被评为优秀学生！");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
