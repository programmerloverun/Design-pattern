package com.leo.pattern.prototype.demo;

/**
 * @author leijiong
 * @version 1.0
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}
