package com.leo.principles.p1_OpenClosePrinciple;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        SouGouInput souGouInput = new SouGouInput();
        souGouInput.setSkin(new DefaultSpecificSkin());
        souGouInput.display();
    }
}
