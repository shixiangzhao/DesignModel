package com.cienet.factorymethod.impl;

import com.cienet.factorymethod.LeiFeng;
import com.cienet.factorymethod.Volunteer;

public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
