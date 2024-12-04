package com.leo.pattern.memento.game;

/**
 * @author leijiong
 * @version 1.0
 */
public class GameRole {

    private int vit;

    private int def;

    public GameRole() {
    }


    public Memento createMemento() {
        return new Memento(vit, def);
    }


    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }


    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }


    public void display() {
        System.out.println("攻击力：" + this.vit + " " + "防御力：" + this.def);
    }


}
