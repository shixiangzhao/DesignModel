package com.cienet.state.impl;

public class RestState extends State {

    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点，下班回家了！");
    }
}
