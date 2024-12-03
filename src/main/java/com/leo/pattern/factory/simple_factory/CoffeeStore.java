package com.leo.pattern.factory.simple_factory;

/**
 * @author leijiong
 * @version 1.0
 */public class CoffeeStore {

     public Coffee orderCoffee(String type) {
         SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
         Coffee coffee = factory.createCoffee(type);
         coffee.addMilk();
         coffee.addsugar();
         return coffee;
     }
}
