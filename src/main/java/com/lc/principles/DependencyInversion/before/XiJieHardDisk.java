package com.lc.principles.DependencyInversion.before;

/**
 * @author: L.C
 * @date: 2023/10/28 0:06
 * @description: 希捷硬盘
 */
public class XiJieHardDisk {

    //存储数据的方法
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    //获取数据的方法
    public String get() {
        System.out.println("使用希捷硬盘取数据");
        return "数据";
    }
}
