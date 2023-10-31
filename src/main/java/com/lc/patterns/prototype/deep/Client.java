package com.lc.patterns.prototype.deep;

import java.io.*;

/**
 * @author: L.C
 * @date: 2023/10/30 16:51
 * @description:
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStu(student);

        //写对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./b.txt"));

        oos.writeObject(citation);
        oos.close();

        //读对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./b.txt"));
        Citation object = (Citation) ois.readObject();
        ois.close();

        object.getStu().setName("李四");

        citation.show();
        object.show();
    }
}
