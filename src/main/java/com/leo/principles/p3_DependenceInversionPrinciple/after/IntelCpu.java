package com.leo.principles.p3_DependenceInversionPrinciple.after;

public class IntelCpu implements Cpu{

    public void run() {
        System.out.println("使用Intel处理器");
    }
}