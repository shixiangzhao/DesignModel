package com.cienet.ChainOfResponsibility;

/**
 * 解决大量的if...else判读，造成的分支混乱，难以维护的问题
 * class: Client <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 10:32
 */
public class Client {

    public static void main(String[] args) {
        ConcreteHandler1 h1 = new ConcreteHandler1();
        ConcreteHandler2 h2 = new ConcreteHandler2();
        ConcreteHandler3 h3 = new ConcreteHandler3();
        // 设置职责链的上家与接盘侠
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 12, 21, 25, 26, 32};
        for (int r : requests) {
            h1.handleRequest(r);
        }

    }


}