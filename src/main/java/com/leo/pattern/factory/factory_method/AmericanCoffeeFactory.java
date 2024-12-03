package com.leo.pattern.factory.factory_method;

import com.leo.pattern.factory.abstract_factory.Dessert;
import com.leo.pattern.factory.abstract_factory.MatchaMousse;

/**
 * @author leijiong
 * @version 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
