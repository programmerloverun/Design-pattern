package com.leo.pattern.flyweight;

/**
 * @author leijiong
 * @version 1.0
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }


}
