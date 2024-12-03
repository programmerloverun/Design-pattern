package com.leo.pattern.factory.abstract_factory;

/**
 * @author leijiong
 * @version 1.0
 */
public class ItalyDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
