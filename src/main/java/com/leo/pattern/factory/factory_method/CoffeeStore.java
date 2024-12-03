package com.leo.pattern.factory.factory_method;

/**
 * @author leijiong
 * @version 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(CoffeeFactory factory)
    {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
