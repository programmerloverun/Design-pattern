package com.leo.pattern.adapter.class_adapter;

/**
 * @author leijiong
 * @version 1.0
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);

    }
}
