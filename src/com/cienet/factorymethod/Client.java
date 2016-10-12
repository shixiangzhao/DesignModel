package com.cienet.factorymethod;

import com.cienet.factorymethod.impl.IFactory;
import com.cienet.factorymethod.impl.UndergraduateFactory;

/**
 * 学雷锋之工厂方法模式设计：
 * 工厂方法模式，定义一个用于创建对象的借口，让子类决定实例化哪一个类。
 * 工厂方法使一个类的实例化延迟到子类。
 * 简单工厂最大的优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关类，对于客户端来说，去除了与具体产品的依赖。
 * 工厂方法完全遵守开放-封闭的原则，对扩展开放，对修改封闭。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("普通方法： ");
        LeiFeng xueleifeng = new Undergraduate();
        xueleifeng.buyRise();
        xueleifeng.sweep();
        xueleifeng.wash();
        
        System.out.println("简单工厂模式： ");
        LeiFeng studentA = SimpleFactory.createLeiFeng("1");
        studentA.buyRise();
        LeiFeng studentB = SimpleFactory.createLeiFeng("1");
        studentB.wash();
        LeiFeng studentC = SimpleFactory.createLeiFeng("1");
        studentC.sweep();
        
        System.out.println("工厂方法模式： ");
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();
        student.sweep();
        student.buyRise();
        student.wash();
    }
}
