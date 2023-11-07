package com.lc.patterns.command;

import java.util.Map;
import java.util.Set;

/**
 * @author: L.C
 * @date: 2023/11/7 22:07
 * @description: 具体命令类
 */
public class OrderCommand implements Command{

    //持有接受着对象
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> keys = foodDir.keySet();
        for (String foodName : keys){
            receiver.makeFood(foodName, foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable() + "桌的餐食准备好了！！!");
    }
}
