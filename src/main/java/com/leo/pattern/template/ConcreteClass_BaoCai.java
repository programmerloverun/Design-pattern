package com.leo.pattern.template;

/**
 * @author leijiong
 * @version 1.0
 */
public class ConcreteClass_BaoCai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("导入包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("加入辣椒");
    }
}
