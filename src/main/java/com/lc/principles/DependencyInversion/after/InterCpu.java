package com.lc.principles.DependencyInversion.after;

/**
 * @author: L.C
 * @date: 2023/10/28 0:09
 * @description: Inter cpu
 */
public class InterCpu implements Cpu {
    public void run() {
        System.out.println("使用Inter处理器");
    }
}
