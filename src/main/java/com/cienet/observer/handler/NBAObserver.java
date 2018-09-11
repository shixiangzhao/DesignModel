package com.cienet.observer.handler;

//看NBA的同事
public class NBAObserver {

    private String name;
    private Notifier sub;

    public NBAObserver(String name, Notifier sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeNBADirectSeeding() {
        System.out.println(sub.getAction() + " , " + name + " 关闭NBA比赛，继续工作！");
    }

}
