package com.cienet.ChainOfResponsibility.impl;

/**
 * 总经理
 * class: GeneralManager <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 11:05
 */
public class GeneralManager extends Manager {

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() < 100) {
            System.out.println(this.getClass().getName() + " handle " + request);
        } else if (superior != null) {
            superior.requestApplications(request);
        }
    }
}