package com.leo.pattern.factory.abstract_factory;

import com.leo.pattern.factory.factory_method.AmericanCoffeeFactory;
import com.leo.pattern.factory.factory_method.Coffee;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        Coffee coffee = americanCoffeeFactory.createCoffee();
        System.out.println(coffee.getName());


        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Dessert dessert = italyDessertFactory.createDessert();
        dessert.show();

    }
}
