package com.lc.patterns.bridge;

/**
 * @author: L.C
 * @date: 2023/11/3 13:26
 * @description: rmvb视频文件（具体实现化角色）
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
