package com.leo.pattern.factory.factory_method;

import com.leo.pattern.factory.abstract_factory.Dessert;

/**
 * @author leijiong
 * @version 1.0
 */
public interface CoffeeFactory {
    public Coffee createCoffee();

    public Dessert createDessert();
}
