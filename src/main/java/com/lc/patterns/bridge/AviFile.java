package com.lc.patterns.bridge;

/**
 * @author: L.C
 * @date: 2023/11/3 13:24
 * @description: avi视频文件（具体实现化角色）
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
