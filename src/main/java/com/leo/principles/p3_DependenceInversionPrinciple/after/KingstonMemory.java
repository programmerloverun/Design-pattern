package com.leo.principles.p3_DependenceInversionPrinciple.after;

public class KingstonMemory implements Memory{

    public void save() {
        System.out.println("使用金士顿作为内存条");
    }
}