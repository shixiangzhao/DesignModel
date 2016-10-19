package com.cienet.builder.impl;
/**
 * 肯德基与鱼香肉丝之建造者模式的设计：
 * 建造者模式，将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 如果使用了建造者模式，那么用户就只需要指定需要建造的类型就可以得到它们，而具体建造的过程和细节就不需要知道了。
 * 它主要是用于创建一些复杂的对象，这些对象内部构建间的构造顺序通常是稳定的，但对象内部的构建通常通常面临这复杂的变化。
 * 建造者模式是在，当创建对象的算法应该独立于该对象的组成部分以及他们的装配方式时适用的模式。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args){
        PersonBuilder personFatBuilder = new PersonFatBuilder();
        PersonDirector personDirector = new PersonDirector(personFatBuilder);
        personDirector.createPerson();

        PersonBuilder personThinBuilder = new PersonThinBuilder();
        PersonDirector personDirector2 = new PersonDirector(personThinBuilder);
        personDirector2.createPerson();
    }
}
