package com.leo.pattern.factory.simple_factory;


/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("american");
        System.out.println(coffee.getName());


    }
}
