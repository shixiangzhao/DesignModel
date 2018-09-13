package com.cienet.flyweight.impl;

/**
 * class: Client <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 17:14
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite = webSiteFactory.getWebSite("产品展示");
        webSite.usedByUser(new User("小明"));
        WebSite webSite1 = webSiteFactory.getWebSite("产品展示");
        webSite1.usedByUser(new User("小华"));
        WebSite webSite2 = webSiteFactory.getWebSite("博客");
        webSite2.usedByUser(new User("老顽童"));
        WebSite webSite3 = webSiteFactory.getWebSite("博客");
        webSite3.usedByUser(new User("东方不败"));

        System.out.println("网站总数：" + webSiteFactory.getWebSiteCount());


    }
}