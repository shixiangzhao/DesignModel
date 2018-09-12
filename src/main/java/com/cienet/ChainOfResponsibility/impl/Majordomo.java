package com.cienet.ChainOfResponsibility.impl;

/**
 * 总监
 * class: Majordomo <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 11:05
 */
public class Majordomo extends Manager {

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() < 5) {
            System.out.println(this.getClass().getName() + " handle " + request);
        } else if (superior != null) {
            superior.requestApplications(request);
        }
    }
}