package com.lc.principles.InterfaceIsolation.before;

/**
 * @author: L.C
 * @date: 2023/10/28 0:45
 * @description: 黑马品牌的安全门
 */
public class HeimaSafetyDoor implements SafetyDoor {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
