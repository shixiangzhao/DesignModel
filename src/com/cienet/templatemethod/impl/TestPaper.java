package com.cienet.templatemethod.impl;

public class TestPaper {
    
    public void testQuestion1() {
        System.out.println("java是从( )语言改进重新设计。 　a.ada b.c c.pasacal d.basic");
        System.out.println("答案：" + answer1());
    }

    protected String answer1() {
        return "";
    }

    public void testQuestion2() {
        System.out.println("提供java存取数据库能力的包是( ) a.java.sql b.java.awt c.java.lang d.java.swing");
        System.out.println("答案：" + answer2());
    }

    protected String answer2() {
        return "";
    }

    public void testQuestion3() {
        System.out.println("下列运算符合法的是( ) a.& b.<> c.if d.:=");
        System.out.println("答案：" + answer3());
    }

    protected String answer3() {
        return "";
    }

    public void templateMethod(){
        testQuestion1();
        testQuestion2();
        testQuestion3();
    }
}
