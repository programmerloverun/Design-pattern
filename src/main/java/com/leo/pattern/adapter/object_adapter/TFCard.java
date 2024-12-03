package com.leo.pattern.adapter.object_adapter;

/**
 * @author leijiong
 * @version 1.0
 */
public interface TFCard {
    //读取TF卡方法
    String readTF();
    //写入TF卡功能
    void writeTF(String msg);
}
