package com.lc.principles.DependencyInversion.after;

/**
 * @author: L.C
 * @date: 2023/10/28 0:32
 * @description:
 */
public class ComputerDemo {
    public static void main(String[] args) {
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new InterCpu();
        Memory memory = new KingstonMemory();

        Computer computer = new Computer();

        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
        
        computer.run();
    }
}
