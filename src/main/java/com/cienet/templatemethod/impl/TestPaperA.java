package com.cienet.templatemethod.impl;

public class TestPaperA extends TestPaper {

    @Override
    protected String answer1() {
        return "c";
    }

    @Override
    protected String answer2() {
        return "b";
    }

    @Override
    protected String answer3() {
        return "d";
    }
}