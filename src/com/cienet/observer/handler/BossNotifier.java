package com.cienet.observer.handler;

// 老板
public class BossNotifier extends Notifier {

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
        System.out.println("老板，增加了事件委任");
        this.getEventHandler().addEvent(object, methodName, args);
    }
}
