package com.leo.pattern.factory.abstract_factory;

/**
 * @author leijiong
 * @version 1.0
 */
public interface DessertFactory {

    public Coffee createCoffee();

    public Dessert createDessert();
}
