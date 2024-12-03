package com.leo.pattern.adapter.class_adapter;

/**
 * @author leijiong
 * @version 1.0
 */
public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
