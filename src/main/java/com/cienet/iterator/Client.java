package com.cienet.iterator;

/**
 * 迭代器模式，提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示。
 * 应用场景：当需要访问一个聚集对象，不管对象是什么都需要遍历时；当需要对聚集有多种遍历方式时。
 * 具体特征：一个Aggregate用于保存聚集元素，并具有访问聚集元素的个数、按序号访问、增加元素的方法，
 * 一个Iterator用于遍历聚集元素，并具有hasNext和next等方法。
 * 模式优势：迭代器模式就是分离了集合行为的遍历行为，抽象出一个迭代器来负责，这样可以做到在不暴露对象内部结构。
 * @author Shixiang
 *
 */
public class Client {

    public static void main(String[] args) {
    	ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem("王二");
        aggregate.addItem("行李");
        aggregate.addItem("老外");
        aggregate.addItem("小偷");

        Iterator it = aggregate.createIterator();
        Object first = it.first();
        System.out.println("First: " + first);
        while(!it.isDone()) {
        	System.out.println(String.format("%s 请买票", it.next()));
        }
        
    }
}
