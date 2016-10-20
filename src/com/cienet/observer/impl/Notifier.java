package com.cienet.observer.impl;

public abstract class Notifier {

    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notifyOthers();
}
