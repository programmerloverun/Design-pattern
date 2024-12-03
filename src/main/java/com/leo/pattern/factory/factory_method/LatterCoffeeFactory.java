package com.leo.pattern.factory.factory_method;

import com.leo.pattern.factory.abstract_factory.Dessert;
import com.leo.pattern.factory.abstract_factory.Trimisu;

/**
 * @author leijiong
 * @version 1.0
 */
public class LatterCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
