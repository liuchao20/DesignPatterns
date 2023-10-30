package com.lc.principles.InterfaceIsolation.after;

/**
 * @author: L.C
 * @date: 2023/10/28 0:54
 * @description:
 */
public class ItcastSafetyDoor implements AntiTheft, FireProof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
