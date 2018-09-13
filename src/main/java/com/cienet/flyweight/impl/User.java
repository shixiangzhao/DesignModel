package com.cienet.flyweight.impl;

/**
 * class: User <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 17:04
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}