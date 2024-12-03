package com.leo.principles.p1_OpenClosePrinciple;

/**
 * @author leijiong
 * @version 1.0
 */
public class SouGouInput {
    private AbstractSkin skin;
    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    void display() {
        skin.display();
    }

}
