package com.lc.patterns.template;

/**
 * @author: L.C
 * @date: 2023/11/4 21:47
 * @description:
 */
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的调料是辣椒");
    }
}
