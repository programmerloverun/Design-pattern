package com.leo.pattern.facade;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("帮我打开");
    }
}
