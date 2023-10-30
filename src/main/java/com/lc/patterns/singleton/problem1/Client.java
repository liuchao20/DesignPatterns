package com.lc.patterns.singleton.problem1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author: L.C
 * @date: 2023/10/28 14:04
 * @description: 测试使用序列化|反序列化破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();

    }

    //从文件中读取数据（对象）
    public static void readObjectFromFile() throws Exception {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./a.txt"));
        //读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        //释放资源
        ois.close();
    }


    //向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        //获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./a.txt"));
        //写对象
        oos.writeObject(instance);
        //释放资源
        oos.close();
    }
}
