package com.cienet.decorator.impl;

public class Finery extends Person {

    protected Person component;

    public void setComponent(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
