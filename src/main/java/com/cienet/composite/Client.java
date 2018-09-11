package com.cienet.composite;

/**
 * 应用场景：当发现需求中体现部分与整体层次关系时，
 * 以及希望用户忽略组合对象与单个对象的不同，统一的使用组合结构中的所有对象时。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("root");

        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite com1 = new Composite("Composite X");
        com1.add(new Leaf("Leaf XA"));
        com1.add(new Leaf("Leaf XB"));
        root.add(com1);

        Composite com2 = new Composite("Composite XY");
        com2.add(new Leaf("Leaf XYA"));
        com2.add(new Leaf("Leaf XYB"));
        com1.add(com2);

        root.add(new Leaf("Leaf C"));

        Leaf leafd = new Leaf("Leaf D");
        root.add(leafd);
        root.remove(leafd);

        root.display(1);
    }
}
