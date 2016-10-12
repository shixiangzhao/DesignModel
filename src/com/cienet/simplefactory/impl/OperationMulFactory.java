package com.cienet.simplefactory.impl;

import com.cienet.simplefactory.Operation;
import com.cienet.simplefactory.OperationMul;

public class OperationMulFactory implements IFactory {
    @Override
    public Operation createOperate(){
        return new OperationMul();
    }
}
