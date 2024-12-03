package com.leo.pattern.builder.demo;

/**
 * @author leijiong
 * @version 1.0
 */
public class Director {

    private Builder builder;

    public Director(Builder builder)
    {
        this.builder = builder;
    }

    public Bike construct()
    {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
