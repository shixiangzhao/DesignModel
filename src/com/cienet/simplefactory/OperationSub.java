package com.cienet.simplefactory;

public class OperationSub extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}
