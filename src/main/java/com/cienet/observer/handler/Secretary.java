package com.cienet.observer.handler;

// 前台秘书
public class Secretary extends Notifier {

    @Override
    public void notifyX() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("秘书，增加事件委任");
        this.getEventHandler().addEvent(object, methodName, args);
    }
}
