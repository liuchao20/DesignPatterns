package com.lc.principles.DependencyInversion.after;

/**
 * @author: L.C
 * @date: 2023/10/28 0:11
 * @description: 金士顿内存条
 */
public class KingstonMemory implements Memory {
    public void save() {
        System.out.println("使用金士顿作为内存条");
    }
}
