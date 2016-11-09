package com.cienet.memento.impl;

public class GameRole {

    private int vitality;
    private int attack;
    private int defense;

    public GameMemento createMemento() {
        return new GameMemento(vitality, attack, defense);
    }

    public void setMemento(GameMemento gameMemento) {
        this.vitality = gameMemento.getVitality();
        this.attack = gameMemento.getAttack();
        this.defense = gameMemento.getDefense();
    }

    public void stateDisplay() {
        System.out.println("角色当前的状态：");
        System.out.println("体力：" + this.vitality);
        System.out.println("攻击力：" + this.attack);
        System.out.println("防御力：" + this.defense);
    }

    public void getInitState() {
        this.vitality = 90;
        this.attack = 80;
        this.defense = 10;
    }

    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

}
