package com.cienet.observer.impl;

import java.util.ArrayList;
import java.util.List;

// 前台秘书
public class BossNotifier extends Notifier {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyOthers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
