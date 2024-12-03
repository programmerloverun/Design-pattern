package com.leo.pattern.decorator;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.cost());


        // 鸡蛋炒饭
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost());
    }
}
