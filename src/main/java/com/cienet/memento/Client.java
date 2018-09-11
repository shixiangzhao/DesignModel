package com.cienet.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();
        
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());
        
        originator.setState("Off");
        originator.show();
        
        originator.setMemento(careTaker.getMemento());
        originator.show();
    }

}
