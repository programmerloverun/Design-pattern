package com.leo.pattern.proxy.static_proxy;

/**
 * @author leijiong
 * @version 1.0
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
