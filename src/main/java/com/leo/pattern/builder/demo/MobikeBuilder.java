package com.leo.pattern.builder.demo;

/**
 * @author leijiong
 * @version 1.0
 */
public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        System.out.println("铝合金车架");
    }

    @Override
    public void buildSeat() {
        System.out.println("真皮车座");
    }

    @Override
    public Bike createBike() {
        return myBike;
    }
}
