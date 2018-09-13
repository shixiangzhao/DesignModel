package com.cienet.flyweight.impl;

/**
 * class: ConcreteWebSite <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 17:05
 */
public class ConcreteWebSite extends WebSite {

    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void usedByUser(User user) {
        System.out.println(this.getClass().getName() + " 网站分类: " + name + " used by " + user.getName());
    }
}