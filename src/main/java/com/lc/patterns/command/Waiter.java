package com.lc.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: L.C
 * @date: 2023/11/7 22:17
 * @description:
 */
public class Waiter {
    //持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd) {
        commands.add(cmd); 
    }

    //发起命令，订单来了
    public void orderUp() {
        System.out.println("服务员：大厨，订单来了");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
