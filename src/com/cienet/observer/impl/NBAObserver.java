package com.cienet.observer.impl;

//看NBA的同事
public class NBAObserver extends Observer {

    private String name;
    private Notifier sub;

    public NBAObserver(String name, Notifier sub) {
        this.name = name;
        this.sub = sub;
    }

    @Override
    public void update() {
        System.out.println(sub.getAction() + " , " + name + " 关闭NBA比赛，继续工作！");
    }

}
