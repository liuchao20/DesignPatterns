package com.lc.patterns.command;

/**
 * @author: L.C
 * @date: 2023/11/7 22:23
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //创建订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面", 1);
        order1.setFood("可乐", 2);


        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("皮蛋瘦肉粥", 1);
        order2.setFood("啤酒", 1);

        //创建厨师对象
        SeniorChef receiver = new SeniorChef();
        OrderCommand cmd1 = new OrderCommand(receiver,order1);
        OrderCommand cmd2 = new OrderCommand(receiver,order2);

        //创建调用者，服务员
        Waiter invoke = new Waiter();
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);

        invoke.orderUp();
    }
}
