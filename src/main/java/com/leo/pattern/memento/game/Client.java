package com.leo.pattern.memento.game;


/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("大战之初");
        gameRole.display();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();

        System.out.println("恢复");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();


    }
}
