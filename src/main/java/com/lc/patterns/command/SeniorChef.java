package com.lc.patterns.command;

import java.util.NoSuchElementException;

/**
 * @author: L.C
 * @date: 2023/11/7 22:04
 * @description: 厨师类
 */
public class SeniorChef {

    public void makeFood(String name, int num){
        System.out.println(num + "份" + name);
    }
}
