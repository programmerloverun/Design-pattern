package com.leo.principles.p5_LawOfDemeter;

public class Star {
    private String name;

    public Star(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}