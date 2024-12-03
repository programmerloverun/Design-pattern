package com.leo.pattern.proxy.static_proxy;

/**
 * @author leijiong
 * @version 1.0
 */
public class ProxyPoint implements SellTickets{

    private TrainStation station = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费用");
        station.sell();
    }
}
