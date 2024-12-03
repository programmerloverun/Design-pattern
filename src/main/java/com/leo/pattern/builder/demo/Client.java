package com.leo.pattern.builder.demo;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        showBike(new MobikeBuilder());
        showBike(new OfoBuilder());
    }

    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
