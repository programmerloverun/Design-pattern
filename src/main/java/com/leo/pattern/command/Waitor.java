package com.leo.pattern.command;

import java.util.ArrayList;

/**
 * @author leijiong
 * @version 1.0
 */
public class Waitor {

    private ArrayList<Command> commands;

    public Waitor() {
        commands = new ArrayList<>();
    }

    public void setCommands(Command cmd) {
        commands.add(cmd);
    }

    // 执行命令
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (int i = 0; i < commands.size(); i++) {
            Command command = commands.get(i);
            if (command != null) {
                command.execute();
            }
        }
    }
}
