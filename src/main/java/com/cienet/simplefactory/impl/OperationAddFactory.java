package com.cienet.simplefactory.impl;

import com.cienet.simplefactory.Operation;
import com.cienet.simplefactory.OperationAdd;

public class OperationAddFactory implements IFactory {
    @Override
    public Operation createOperate(){
        return new OperationAdd();
    }
}
