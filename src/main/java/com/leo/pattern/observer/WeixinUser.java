package com.leo.pattern.observer;

/**
 * @author leijiong
 * @version 1.0
 * 观察者
 */
public class WeixinUser implements Observer {

    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }


    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
