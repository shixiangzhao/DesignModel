package com.cienet.decorator.impl;

public class Sneakers extends Finery {

    @Override
    public void show() {
        System.out.print("破球鞋 ");
        super.show();
    }
}
