package com.cienet.bridge;

class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }
}
