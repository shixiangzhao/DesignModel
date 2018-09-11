package com.cienet.memento.impl;

public class Client {

    public static void main(String[] args) {
/*
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        GameRole backup = new GameRole();
        backup.setVitality(lixiaoyao.getVitality());
        backup.setAttack(lixiaoyao.getAttack());
        backup.setDefense(lixiaoyao.getDefense());

        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        lixiaoyao.setVitality(backup.getVitality());
        lixiaoyao.setAttack(backup.getAttack());
        lixiaoyao.setDefense(backup.getDefense());
        lixiaoyao.stateDisplay();*/
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(lixiaoyao.createMemento());
        lixiaoyao.stateDisplay();
        
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();
        
        lixiaoyao.setMemento(careTaker.getMemento());
        lixiaoyao.stateDisplay();
    }

}
