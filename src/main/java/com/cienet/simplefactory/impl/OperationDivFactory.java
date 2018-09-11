package com.cienet.simplefactory.impl;

import com.cienet.simplefactory.Operation;
import com.cienet.simplefactory.OperationDiv;

public class OperationDivFactory implements IFactory {
    @Override
    public Operation createOperate(){
        return new OperationDiv();
    }
}
