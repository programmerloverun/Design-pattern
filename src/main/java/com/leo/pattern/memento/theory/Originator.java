package com.leo.pattern.memento.theory;

/**
 * @author leijiong
 * @version 1.0
 */
public class Originator {

    private String state;

    public Originator() {
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // 保存状态
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    // 恢复状态
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }

}
