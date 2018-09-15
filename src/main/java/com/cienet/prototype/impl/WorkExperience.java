package com.cienet.prototype.impl;

/**
 * class: WorkExperience <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 16:26
 */
public class WorkExperience implements Cloneable {

    private String workDate;
    private String company;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}