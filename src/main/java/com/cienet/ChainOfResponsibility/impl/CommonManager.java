package com.cienet.ChainOfResponsibility.impl;

/**
 * 经理
 * class: CommonManager <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 11:05
 */
public class CommonManager extends Manager {

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() < 2) {
            System.out.println(this.getClass().getName() + " handle " + request);
        } else if (superior != null) {
            superior.requestApplications(request);
        }
    }
}