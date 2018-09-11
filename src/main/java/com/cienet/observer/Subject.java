package com.cienet.observer;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyOthers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
