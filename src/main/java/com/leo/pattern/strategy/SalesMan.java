package com.leo.pattern.strategy;

/**
 * @author leijiong
 * @version 1.0
 */
public class SalesMan {

    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow() {
        strategy.show();
    }
}
