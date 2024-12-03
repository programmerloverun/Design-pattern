package com.leo.pattern.decorator;

/**
 * @author leijiong
 * @version 1.0
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12, "炒面");
    }


    @Override
    public float cost() {
        return getPrice();
    }
}
