package com.cienet.decorator;

public class Client {

    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorA cd1 = new ConcreteDecoratorA();
        ConcreteDecoratorB cd2 = new ConcreteDecoratorB();
        
        cd1.setComponent(cc);
        cd2.setComponent(cd1);
        cd2.operation();
    }

}
