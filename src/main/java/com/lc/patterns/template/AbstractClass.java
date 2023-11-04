package com.lc.patterns.template;

/**
 * @author: L.C
 * @date: 2023/11/4 21:39
 * @description: 抽象类（定义模版方法和基本方法）
 */
public abstract class AbstractClass {
    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    //放蔬菜
    public abstract void pourVegetable();

    //放调料
    public abstract void pourSauce();

    //翻炒
    public void fry() {
        System.out.println("翻炒");
    }
}
