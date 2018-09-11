package com.cienet.builder;

public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("PartX");
    }

    @Override
    public void buildPartB() {
        product.add("PartY");
    }

    @Override
    public Product getResult() {
        return product;
    }

}
