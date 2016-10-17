package com.cienet.templatemethod;

public class Client {

    public static void main(String[] args) {
        AbstractClass class1;
        class1 = new ConcreteClassA();
        class1.templateMethod();

        class1 = new ConcreteClassB();
        class1.templateMethod();
    }
}
