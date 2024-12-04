package com.leo.pattern.memento.theory;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("状态1");

        Caretaker caretaker = new Caretaker();
        originator.getStateFromMemento(new Memento("状态2"));
        caretaker.add(originator.saveStateMemento());
        originator.getStateFromMemento(new Memento("状态3"));
        caretaker.add(originator.saveStateMemento());
        originator.getStateFromMemento(new Memento("状态4"));
        caretaker.add(originator.saveStateMemento());
        System.out.println("当前状态: " + originator.getState());
        // 恢复状态
        originator.getStateFromMemento(caretaker.getMemento(1));
        System.out.println("恢复状态: " + originator.getState());

    }
}
