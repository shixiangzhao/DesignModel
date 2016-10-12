package com.cienet.simplefactory;

import com.cienet.simplefactory.impl.IFactory;
import com.cienet.simplefactory.impl.OperationAddFactory;

/**
 * 计算器功能的设计：
 * 开发人员需要关注，到底要实例化谁，将来会不会增加实例化对象，
 * 比如增加开根运算，这是很容易变化的地方，应该考虑
 * 用一个单独的类来做创造实例的工作，这就是工厂。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args){
        System.out.println("简单工厂模式：");
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(3);
        operation.setNumberB(7);
        System.out.println("Result: " + operation.getResult());

        System.out.println("工厂方法模式：");
        IFactory factory = new OperationAddFactory();
        Operation operation2 = factory.createOperate();
        operation2.setNumberA(4);
        operation2.setNumberB(9);
        System.out.println("Result: " + operation2.getResult());
    }
    
}
