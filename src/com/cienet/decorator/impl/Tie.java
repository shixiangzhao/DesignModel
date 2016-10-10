package com.cienet.decorator.impl;

public class Tie extends Finery {

    @Override
    public void show() {
        System.out.print("领带 ");
        super.show();
    }
}
