package com.leo.pattern.decorator;

/**
 * @author leijiong
 * @version 1.0
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }


    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }


}
