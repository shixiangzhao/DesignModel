package com.cienet.proxy.impl;

public class Pursuit implements GiveGift {

    private String name = "谢攀";
    SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName() + ", " + name + " 给你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName() + ", " + name + " 给你花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(schoolGirl.getName() + ", " + name + " 给你巧克力");
    }
}
