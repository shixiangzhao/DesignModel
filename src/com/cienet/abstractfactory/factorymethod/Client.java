package com.cienet.abstractfactory.factorymethod;

/**
 * 抽象工厂模式，提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 通常是在运行时刻再创建一个ConcreteFactory类的实例，这个具体的工厂再创建具有特定实现的产品对象，
 * 也就是说，为创建不同的产品对象，客户端使用不同的具体工厂。
 * 最大的好处是便于更换产品系列，IFactory iFactory = new SqlServerFactory(); 只在初始化出现一次。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        IFactory iFactory = new SqlServerFactory();
        IServerUser isUser = iFactory.createServerUser();
        isUser.insert(user);
        isUser.findUser(1);

        System.out.println("-----------------------------------");
        iFactory = new AccessServerFactory();
        IServerUser isUser2 = iFactory.createServerUser();
        isUser2.insert(user);
        isUser2.findUser(1);
        
        System.out.println("===================================");
        Department department = new Department();
        iFactory = new SqlServerFactory();
        IServerDepartment isDepartment = iFactory.createServerDepartment();
        isDepartment.insert(department);
        isDepartment.findDepartment(1);

        System.out.println("-----------------------------------");
        iFactory = new AccessServerFactory();
        IServerDepartment isDepartment2 = iFactory.createServerDepartment();
        isDepartment2.insert(department);
        isDepartment2.findDepartment(1);
    }
}
