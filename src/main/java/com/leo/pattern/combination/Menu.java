package com.leo.pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leijiong
 * @version 1.0
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();


    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }

    }
}
