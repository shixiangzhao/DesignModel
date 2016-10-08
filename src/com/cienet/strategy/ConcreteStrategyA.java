package com.cienet.strategy;

public class ConcreteStrategyA extends Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyA.algorithmInterface() run!");
    }
}
