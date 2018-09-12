package com.cienet.ChainOfResponsibility.impl;

import com.cienet.ChainOfResponsibility.ConcreteHandler1;
import com.cienet.ChainOfResponsibility.ConcreteHandler2;
import com.cienet.ChainOfResponsibility.ConcreteHandler3;

import java.util.ArrayList;
import java.util.List;

/**
 * 现实场景：逐级审批逻辑
 * class: Client <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 10:32
 */
public class Client {

    public static void main(String[] args) {
        CommonManager h1 = new CommonManager();
        Majordomo h2 = new Majordomo();
        GeneralManager h3 = new GeneralManager();
        // 设置职责链的上级或者说接盘侠
        h1.setSuperior(h2);
        h2.setSuperior(h3);

        List<Request> requests = new ArrayList<>();
        for(int i=0;i<4;i++){
            Request request = new Request();
            request.setRequestType("请假");
            request.setNumber(i * 2 + 1);
            requests.add(request);
        }
        for (Request r : requests) {
            h1.requestApplications(r);
        }

    }


}