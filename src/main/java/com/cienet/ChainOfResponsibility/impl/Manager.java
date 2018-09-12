package com.cienet.ChainOfResponsibility.impl;

/**
 * class: Manager <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 11:05
 */
public abstract class Manager {
    protected Manager superior;

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}