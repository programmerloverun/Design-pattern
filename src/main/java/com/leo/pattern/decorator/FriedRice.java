package com.leo.pattern.decorator;

/**
 * @author leijiong
 * @version 1.0
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(11, "炒饭");
    }


    @Override
    public float cost() {
        return getPrice();
    }
}
