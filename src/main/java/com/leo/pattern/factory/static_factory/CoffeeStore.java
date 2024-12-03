package com.leo.pattern.factory.static_factory;

/**
 * @author leijiong
 * @version 1.0
 */public class CoffeeStore {

     public Coffee orderCoffee(String type) {
         Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
         coffee.addMilk();
         coffee.addsugar();
         return coffee;
     }
}
