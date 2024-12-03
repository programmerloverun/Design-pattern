package com.leo.pattern.factory.config_factory;


/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());


    }
}
