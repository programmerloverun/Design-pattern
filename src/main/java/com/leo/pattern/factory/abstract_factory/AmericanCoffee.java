package com.leo.pattern.factory.abstract_factory;



/**
 * @version v1.0
 * @ClassName: AmericanCoffee
 * @Description: 没事咖啡
 * @Author: 黑马程序员
 */
public class AmericanCoffee extends Coffee {


    @Override
    public void getName() {
        System.out.println("美式咖啡");
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
