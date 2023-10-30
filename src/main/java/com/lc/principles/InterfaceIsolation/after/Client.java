package com.lc.principles.InterfaceIsolation.after;

/**
 * @author: L.C
 * @date: 2023/10/28 0:46
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("=================");

        ItcastSafetyDoor itcastSafetyDoor = new ItcastSafetyDoor();
        itcastSafetyDoor.antiTheft();
        itcastSafetyDoor.fireProof();
    }
}
