package com.cienet.strategy.impl;

public class CashContext {

    private CashSuper cashSuper;
    /*
    public CashContext (CashSuper cashSuper){
        this.cashSuper = cashSuper;
    }
    */
    // 策略与简单工厂结合
    public CashContext(String type) {
        switch (type) {
        case "1":
            cashSuper = new CashNormal();
            break;
        case "2":
            cashSuper = new CashRebate(0.8);
            break;
        case "3":
            cashSuper = new CashReturn(300, 100);
            break;

        default:
            break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
