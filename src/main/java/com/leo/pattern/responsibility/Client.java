package com.leo.pattern.responsibility;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小花", 100, "身体不适");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);//小组长的领导是部门经理
        manager.setNextHandler(generalManager);//部门经理的领导是总经理

        groupLeader.submit(leaveRequest);
    }
}
