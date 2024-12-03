package com.leo.pattern.strategy;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }
}
