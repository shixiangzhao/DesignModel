package com.cienet.composite.impl;

/**
 * 应用场景：当发现需求中体现部分与整体层次关系时， 
 * 以及希望用户忽略组合对象与单个对象的不同，统一的使用组合结构中的所有对象时。
 * 具体特征：一个所有类都必须继承的抽象类，叶子节点类实现抽象类的具体方法， 
 * 非叶子节点类除了实现抽象类的具体方法，还具有一个List容器用来存放其子节点。
 * 
 * @author shixiang.zhao
 */
public class Client {

	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));

		ConcreteCompany comp = new ConcreteCompany("上海分公司");
		comp.add(new HRDepartment("上海分公司人力资源部"));
		comp.add(new FinanceDepartment("上海分公司财务部"));
		root.add(comp);

		ConcreteCompany comp2 = new ConcreteCompany("上海浦东办事处");
		comp2.add(new HRDepartment("上海浦东办事处人力资源部"));
		comp2.add(new FinanceDepartment("上海浦东办事处财务部"));
		comp.add(comp2);

		System.out.println("结构图：");
		root.display(1);
		System.out.println("职责：");
		root.lineOfDuty();
	}
}
