package com.lc.patterns.template;

/**
 * @author: L.C
 * @date: 2023/11/4 22:07
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();

        baoCai.cookProcess();
        System.out.println("===========");
        caiXin.cookProcess();
    }
}
