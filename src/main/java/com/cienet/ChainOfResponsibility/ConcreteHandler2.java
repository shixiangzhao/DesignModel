package com.cienet.ChainOfResponsibility;

/**
 * class: ConcreteHandler2 <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 10:07
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass().getName() + " handle " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}