package com.cienet.memento.impl;

public class GameMemento {

    private int vitality;
    private int attack;
    private int defense;

    public GameMemento(int vitality, int attack, int defense) {
        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }

    public int getVitality() {
        return vitality;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

}
