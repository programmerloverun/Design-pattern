package com.leo.principles.p5_LawOfDemeter;

public class Company {
    private String name;

    public Company(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}