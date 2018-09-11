package com.cienet.templatemethod.impl;

/**
 * 试卷抄错也白搭之模板方法模式设计：
 * 模板方法模式，定义一个操作中的算法的骨架，而讲一些步骤延迟到子类中。
 * 模板方法使得子类可以改变一个算法的结构，即可以重定义该算法的某些特定步骤。
 * 一句话，模板方法是通过把不变的行为搬移到超类，去除子类中的重复代码。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        TestPaper testPaper;
        System.out.println("----------A抄写的答案：----------");
        testPaper = new TestPaperA();
        testPaper.templateMethod();

        System.out.println("----------B抄写的答案：----------");
        testPaper = new TestPaperB();
        testPaper.templateMethod();
    }
}
