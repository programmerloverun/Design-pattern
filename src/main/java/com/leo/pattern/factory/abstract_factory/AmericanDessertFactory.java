package com.leo.pattern.factory.abstract_factory;

/**
 * @author leijiong
 * @version 1.0
 */
public class AmericanDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }

}
