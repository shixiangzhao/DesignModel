package com.cienet.observer.handler;

public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object, String methodName, Object... args);

    public abstract void notifyX();

}
