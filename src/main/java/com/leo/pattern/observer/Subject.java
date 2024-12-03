package com.leo.pattern.observer;

/**
 * @author leijiong
 * @version 1.0
 * 抽象主题类
 */
public interface Subject {

    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notify(String message);
}
