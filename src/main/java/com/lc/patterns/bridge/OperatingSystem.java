package com.lc.patterns.bridge;

/**
 * @author: L.C
 * @date: 2023/11/3 13:29
 * @description: 抽象的操作系统类（抽象化角色）
 */
public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
