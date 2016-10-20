package com.cienet.observer.handler;

import java.util.Date;

//看股票的同事
public class StockObserver {

    private String name;
    private Notifier sub;

    public StockObserver(String name, Notifier sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeStockMarket(Date date) {
        System.out.println(sub.getAction() + " , " + name + " 关闭股票行情，继续工作！ - " + date);
    }

}
