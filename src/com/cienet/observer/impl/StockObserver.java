package com.cienet.observer.impl;

//看股票的同事
public class StockObserver extends Observer {

    private String name;
    private Notifier sub;

    public StockObserver(String name, Notifier sub) {
        this.name = name;
        this.sub = sub;
    }

    @Override
    public void update() {
        System.out.println(sub.getAction() + " , " + name + " 关闭股票行情，继续工作！");
    }

}
