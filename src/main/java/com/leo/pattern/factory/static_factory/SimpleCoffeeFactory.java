package com.leo.pattern.factory.static_factory;

/**
 * @author leijiong
 * @version 1.0
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        if (type == "american") {
            return new AmericanCoffee();
        } else if (type == "latte") {
            return new LatteCoffee();
        } else {
            throw new RuntimeException("没有这种咖啡");
        }
    }
}
