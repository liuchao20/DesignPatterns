package com.lc.patterns.prototype.test;

/**
 * @author: L.C
 * @date: 2023/10/30 16:51
 * @description:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*Citation citation = new Citation();
        citation.setName("张三");
        citation.show();

        Citation clone = citation.clone();
        clone.setName("王五");
        clone.show();

        Citation clone1 = citation.clone();
        clone1.setName("老六");
        clone1.show();*/

        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStu(student);

        Citation clone = citation.clone();
        clone.getStu().setName("李四");

        citation.show();
        clone.show();

    }
}
