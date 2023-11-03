package com.lc.patterns.bridge;

/**
 * @author: L.C
 * @date: 2023/11/3 13:32
 * @description: Windows操作系统（扩展抽象化角色）
 */
public class Windows extends OperatingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
