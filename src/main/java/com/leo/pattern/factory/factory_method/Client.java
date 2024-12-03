package com.leo.pattern.factory.factory_method;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee(new LatterCoffeeFactory());
        System.out.println(coffee.getName());
    }
}
