package com.leo.pattern.combination;

/**
 * @author leijiong
 * @version 1.0
 */
public abstract class MenuComponent {

    protected String name;
    protected int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    // 打印菜单名称的方法（包含子菜单和字菜单项）
    public abstract void print();


}
