package com.cienet.observer.handler;

import java.util.Date;

/**
 * 老板回来了之事件委托模式的设计： 
 * 1. 通知者完全不知道观察者的存在，实现了完全解偶。
 * 2. 一次通知，执行了不同的方法。
 * 3. 扩展性高，新增了一个逛淘宝的同事，只要新增一个类就可以了。
 * @author shixiang.zhao
 */
public class Client {
    public static void main(String[] args) {
        BossNotifier notifier1 = new BossNotifier();
        StockObserver observer1 = new StockObserver("observer1", notifier1);
        NBAObserver observer2 = new NBAObserver("observer2", notifier1);
        
        Date date = new Date();
        notifier1.addListener(observer1, "closeStockMarket", date);
        notifier1.addListener(observer2, "closeNBADirectSeeding");
        
        notifier1.setAction("我回来了");
        notifier1.notifyX();
    }
}
