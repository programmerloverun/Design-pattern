package com.leo.pattern.builder.demo;

/**
 * @author leijiong
 * @version 1.0
 */
public abstract class Builder {

    protected Bike myBike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
