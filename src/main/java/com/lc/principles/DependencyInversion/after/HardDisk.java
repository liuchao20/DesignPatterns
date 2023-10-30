package com.lc.principles.DependencyInversion.after;

/**
 * @author: L.C
 * @date: 2023/10/28 0:24
 * @description:
 */
public interface HardDisk {
    //存储数据的方法
    public void save(String data);

    //获取数据的方法
    public String get();
}
