package com.cienet.ChainOfResponsibility.impl;

/**
 * class: Request <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 11:05
 */
public class Request {

    private String requestType;
    private String requestContent;
    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestType='" + requestType + '\'' +
                ", requestContent='" + requestContent + '\'' +
                ", number=" + number +
                '}';
    }
}