package com.leo.pattern.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @author leijiong
 * @version 1.0
 */
public class SubscriptionSubject implements Subject {

    private List<Observer> weixinUserlist = new ArrayList<>();


    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
