package com.lc.patterns.singleton;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: L.C
 * @date: 2023/10/28 16:48
 * @description:
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ipconfig");
        //获取输入流
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        //读取数据
        int len = inputStream.read(arr);

        System.out.println(new String(arr, 0, len, "GBK"));

    }
}
