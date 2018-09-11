package com.cienet.observer.impl;

/**
 * 老板回来了之观察者者模式的设计： 
 * 观察者模式，定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 * 这个主题对象的状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        Secretary tongzizhe1 = new Secretary();
        BossNotifier tongzizhe2 = new BossNotifier();
        StockObserver tongzhi1 = new StockObserver("魏观眼1", tongzizhe1);
        StockObserver tongzhi2 = new StockObserver("易观察2", tongzizhe2);
        NBAObserver tongzhi3 = new NBAObserver("魏观眼3", tongzizhe2);
        NBAObserver tongzhi4 = new NBAObserver("易观察4", tongzizhe1);

        tongzizhe1.attach(tongzhi1);
        tongzizhe1.attach(tongzhi2);
        tongzizhe1.attach(tongzhi3);
        tongzizhe1.attach(tongzhi4);

        tongzizhe1.setAction("老板回来了");
        tongzizhe1.notifyOthers();

        System.out.println("---------------------------------------");
        tongzizhe2.attach(tongzhi1);
        tongzizhe2.attach(tongzhi2);
        tongzizhe2.attach(tongzhi3);
        tongzizhe2.attach(tongzhi4);
        //tongzizhe2.detach(tongzhi3);

        tongzizhe2.setAction("我回来了");
        tongzizhe2.notifyOthers();
    }
}
