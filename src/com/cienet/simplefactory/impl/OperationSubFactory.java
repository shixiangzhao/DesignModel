package com.cienet.simplefactory.impl;

import com.cienet.simplefactory.Operation;
import com.cienet.simplefactory.OperationSub;

public class OperationSubFactory implements IFactory {
    @Override
    public Operation createOperate(){
        return new OperationSub();
    }
}
