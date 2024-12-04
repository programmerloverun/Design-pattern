package com.leo.pattern.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leijiong
 * @version 1.0
 */
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    // 保存状态
    public void add(Memento memento) {
        this.mementoList.add(memento);
    }

    // 获取状态
    public Memento getMemento(int index) {
        return mementoList.get(index);
    }


}
