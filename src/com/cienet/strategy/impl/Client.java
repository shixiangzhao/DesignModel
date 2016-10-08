package com.cienet.strategy.impl;

public class Client {
    public static void main(String[] args) {
        String type = "2";
        double originalPrice = 1500;
        /*
        CashContext cashContext = null;
        switch (type){
        case "1":
            cashContext = new CashContext(new CashNormal());
            break;
        case "2":
            cashContext = new CashContext(new CashRebate(0.8));
            break;
        case "3":
            cashContext = new CashContext(new CashReturn(300, 100));
            break;
        
        default:
            break;
        }
        */
        /*
        // 简单工厂
        CashContext cashContext = new CashContext(StrategyFactory.createCashSuper(type));
        */
        // 策略与简单工厂结合
        CashContext cashContext = new CashContext(type);
        System.out.println("原价： " + originalPrice);
        System.out.println("现价： " + cashContext.getResult(originalPrice));
    }
}
