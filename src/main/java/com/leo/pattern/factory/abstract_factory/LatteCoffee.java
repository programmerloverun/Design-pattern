package com.leo.pattern.factory.abstract_factory;



/**
 * @version v1.0
 * @ClassName: LatteCoffee
 * @Description: 拿铁咖啡
 * @Author: lei
 */
public class LatteCoffee extends Coffee {


    @Override
    public void getName() {
        System.out.println("拿铁咖啡");
    }

    @Override
    public void addMilk() {
        System.out.println("加奶");
    }

    @Override
    public void addSuger() {
        System.out.println("加糖");
    }
}
