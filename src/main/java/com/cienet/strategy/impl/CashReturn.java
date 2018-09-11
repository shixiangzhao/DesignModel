package com.cienet.strategy.impl;

public class CashReturn extends CashSuper {

    private double greaterCash;
    private double returnCash;

    public CashReturn(double greaterCash, double returnCash) {
        this.greaterCash = greaterCash;
        this.returnCash = returnCash;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= greaterCash) {
            money = money - returnCash;
        }
        return money;
    }
}
