package com.leo.pattern.template;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass baocai = new ConcreteClass_BaoCai();
        baocai.cookProcess();
    }
}
