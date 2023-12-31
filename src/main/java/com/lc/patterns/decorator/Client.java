package com.lc.patterns.decorator;

/**
 * @author: L.C
 * @date: 2023/11/1 16:27
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + ":" + food.cost() + "元");

        System.out.println("=================");

        //在上面的炒饭中加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + ":" + food.cost() + "元");

        System.out.println("=================");

        food = new Egg(food);
        System.out.println(food.getDesc() + ":" + food.cost() + "元");

        System.out.println("=================");

        food = new Bacon(food);
        System.out.println(food.getDesc() + ":" + food.cost() + "元");

    }
}
