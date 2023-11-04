package com.lc.patterns.facade;

/**
 * @author: L.C
 * @date: 2023/11/4 19:05
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        SmartApplicationFacade smart = new SmartApplicationFacade();
        smart.say("起床：打开家电");
        System.out.println("=================");
        smart.say("睡觉：关闭家电");
    }
}
