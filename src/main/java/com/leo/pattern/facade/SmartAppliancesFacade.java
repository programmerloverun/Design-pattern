package com.leo.pattern.facade;

/**
 * @author leijiong
 * @version 1.0
 */
public class SmartAppliancesFacade {

    private AirCondition airCondition;

    private Light light;

    private TV tv;

    public SmartAppliancesFacade() {
        airCondition = new AirCondition();
        light = new Light();
        tv = new TV();
    }

    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if(message.contains("关闭")) {
            close();
        }
    }

    private void on() {
        airCondition.on();
        light.on();
        tv.on();
    }

    private void close() {
        airCondition.off();
        light.off();
        tv.off();
    }
}
