package com.cienet.facade.impl;

public class Fund {

    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;
    Stock4 stock4;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        stock4 = new Stock4();
    }
    
    public void buyFund() {
        stock1.buy();
        stock2.buy();
        stock3.buy();
        stock4.buy();
    }
    
    public void sellFund() {
        stock1.sell();
        stock2.sell();
        stock3.sell();
        stock4.sell();
    }
}
