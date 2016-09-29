package com.cienet.simplefactory;
/**
 * 
 * 开发人员需要关注，到底要实例化谁，将来会不会增加实例化对象，
 * 比如增加开根运算，这是很容易变化的地方，应该考虑
 * 用一个单独的类来做创造实例的工作，这就是工厂。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args){
        Operation operation;
        operation = OperationFactory.createOperate("/");
        operation.setNumberA(3);
        operation.setNumberB(7);
        System.out.println("Result: " + operation.getResult());
    }
    
}
