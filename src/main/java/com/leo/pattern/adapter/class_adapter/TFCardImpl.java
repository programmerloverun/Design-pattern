package com.leo.pattern.adapter.class_adapter;

/**
 * @author leijiong
 * @version 1.0
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg ="tf card read msg : hello word tf card";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
    }
}
