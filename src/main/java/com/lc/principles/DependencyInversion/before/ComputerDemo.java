package com.lc.principles.DependencyInversion.before;

/**
 * @author: L.C
 * @date: 2023/10/28 0:19
 * @description:
 */
public class ComputerDemo {
    public static void main(String[] args) {
        //创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        InterCpu cpu = new InterCpu();
        KingstonMemory memory = new KingstonMemory();
        //创建计算机对象
        Computer computer = new Computer();
        //组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
        //运行计算机
        computer.run();
    }

}
