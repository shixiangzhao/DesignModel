package com.cienet.factorymethod.impl;

import com.cienet.factorymethod.LeiFeng;
import com.cienet.factorymethod.Undergraduate;

public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
