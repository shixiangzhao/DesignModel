package com.cienet.templatemethod.impl;

public class TestPaperB extends TestPaper {

    @Override
    protected String answer1() {
        return "a";
    }

    @Override
    protected String answer2() {
        return "b";
    }

    @Override
    protected String answer3() {
        return "c";
    }
}