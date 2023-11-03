package com.lc.patterns.bridge;

/**
 * @author: L.C
 * @date: 2023/11/3 13:35
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Mac mac = new Mac(new AviFile());
        mac.play("sss.avi");
    }
}
