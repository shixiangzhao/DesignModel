package com.cienet.prototype.impl;

/**
 * class: Resume <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 15:48
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience) work.clone();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperienceToObject(String timeArea, String company) {
        work.setWorkDate(timeArea);
        work.setCompany(company);
    }

    public void display() {
        System.out.println("Resume: " + this.hashCode());
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历Object：" + work.getWorkDate() + " " + work.getCompany());
        System.out.println("-------------------------------");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}