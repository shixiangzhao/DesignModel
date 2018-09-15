package com.cienet.prototype.impl;

/**
 * class: Client <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 15:53
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("shixzh");
        a.setPersonalInfo("男", "28");
        a.setWorkExperienceToObject("1998-2006", "YY企业");

        Resume b = (Resume) a.clone();
        b.setWorkExperienceToObject("2006-2009", "NB企业");

        Resume c = (Resume) a.clone();
        c.setWorkExperienceToObject("2009-2011", "XX企业");

        a.display();
        b.display();
        c.display();
    }

}