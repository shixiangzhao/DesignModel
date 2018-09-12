package com.cienet.ChainOfResponsibility;

/**
 * class: Handler <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 10:07
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}