package com.leo.pattern.command;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDic("可乐", 2);
        order1.setFoodDic("炒饭", 2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDic("果汁", 1);
        order2.setFoodDic("盖饭", 2);

        SeniorChef seniorChef = new SeniorChef();
        Command cmd1 = new OrderCommand(seniorChef, order1);
        Command cmd2 = new OrderCommand(seniorChef, order2);

        Waitor waitor = new Waitor();
        waitor.setCommands(cmd1);
        waitor.setCommands(cmd2);
        waitor.orderUp();

    }
}
