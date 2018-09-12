package com.cienet.ChainOfResponsibility;

/**
 * class: ConcreteHandler1 <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 10:07
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass().getName() + " handle " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}