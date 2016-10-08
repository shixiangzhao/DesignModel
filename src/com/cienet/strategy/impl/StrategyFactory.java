package com.cienet.strategy.impl;

public class StrategyFactory {
    public CashSuper createCashSuper(String type) {
        CashSuper cashSuper = null;
        switch (type) {
        case "1":
            cashSuper = new CashNormal();
            break;
        case "2":
            cashSuper = new CashRebate(0.8);;
            break;
        case "3":
            cashSuper = new CashReturn(300, 100);
            break;

        default:
            break;
        }
        return cashSuper;
    }
}
