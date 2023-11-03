package com.lc.patterns.bridge;

/**
 * @author: L.C
 * @date: 2023/11/3 13:33
 * @description: Mac操作系统（扩展抽象化角色）
 */
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
