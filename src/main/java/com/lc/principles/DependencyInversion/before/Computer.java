package com.lc.principles.DependencyInversion.before;

/**
 * @author: L.C
 * @date: 2023/10/28 0:12
 * @description:
 */
public class Computer {
    private XiJieHardDisk hardDisk;
    private InterCpu cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public InterCpu getCpu() {
        return cpu;
    }

    public void setCpu(InterCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }


    public void run() {
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }
}
