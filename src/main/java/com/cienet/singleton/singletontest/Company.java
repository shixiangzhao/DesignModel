package com.cienet.singleton.singletontest;

import com.cienet.singleton.reflecttest.ReflectTest;

public class Company {

	public static void main(String[] args) {
		Printable normalPrinter1 = new NormalPrinter("普通打印机");
		Printable normalPrinter2 = new NormalPrinter("普通打印机2");
		normalPrinter1.print();
		normalPrinter2.print();
		System.out.println("=============================");
		/*
		 * Lazy Loading 懒加载 懒汉式
		 * 
		 * 在需要的时候才创建单例对象，而不是随着软件系统的运行或者当类被加载器加载的时候就创建。
		 * 当单例类的创建或者单例对象的存在会消耗比较多的资源，常常采用lazy loading策略。 这样做的一个明显好处是提高了软件系统的效率，节约内存资源。
		 * 
		 * Warning：线程不安全
		 */
		Printable lazyPrinter1 = SingletonLazyPrinter.getInstance("懒汉打印机");
		Printable lazyPrinter2 = SingletonLazyPrinter.getInstance("不知道叫什么");

		lazyPrinter1.print();
		lazyPrinter2.print();
		System.out.println("=============================");

		/*
		 * Hungry Loading 饿汉式
		 * 
		 * 在定义自身类型的成员变量时就将其实例化， 使得在Singleton单例类被系统加载时就已经被实例化出一个单例对象， 从而一劳永逸地避免了线程安全的问题。
		 */
		Printable hungryPrinter1 = SingletonHungryPrinter.getInstance("我要用打印机");
		Printable hungryPrinter2 = SingletonHungryPrinter.getInstance("打印机");

		hungryPrinter1.print();
		hungryPrinter2.print();

		System.out.println("=============================");

		/*
		 * synchronized 同步锁式
		 * 
		 */
//		Printable lockPrinter1 = LockSingletonLazyPrinter.getInstance("同步锁打印机");
//		Printable lockPrinter2 = LockSingletonLazyPrinter.getInstance("同打机");
//		lockPrinter1.print();
//		lockPrinter2.print();

		System.out.println("=============================");

		/*
		 * DCL 双重检查式
		 * 
		 */
//		Printable DCLPrinter1 = DCLSingletonLazyPrinter.getInstance("DCL打印机");
//		Printable DCLPrinter2 = DCLSingletonLazyPrinter.getInstance("DCL");
//		DCLPrinter1.print();
//		DCLPrinter2.print();

		System.out.println("=============================");

		/*
		 * StaticInnerClass 静态内部类式
		 * 
		 */
		Printable SICPrinter1 = StaticInnerClassSingletonLazyPrinter.getInstance();
		Printable SICPrinter2 = StaticInnerClassSingletonLazyPrinter.getInstance();
		SICPrinter1.print();
		SICPrinter2.print();

		System.out.println("=============================");
		/*
		 * Registration 登记式
		 * 
		 */
		Printable rgPrinter1 = RegistrationSingletonPrinter.getInstance("我要用打印机", null);
		Printable rgPrinter2 = RegistrationSingletonPrinter.getInstance("打印机", null);

		rgPrinter1.print();
		rgPrinter2.print();

		System.out.println("=============================");

		/*
		 * Enum 枚举式
		 * 
		 */
		EnumSingletonPrinter enumPrinter1 = EnumSingletonPrinter.INSTANCE.getInstance("给我一个打印机");
		EnumSingletonPrinter enumPrinter2 = EnumSingletonPrinter.INSTANCE.getInstance("打印机");
		enumPrinter1.print();
		enumPrinter2.print();

		System.out.println("=============================");

		try {
			ReflectTest.getReflectInstance();
		} catch (Exception e) {

			System.out.println("获取枚举打印机失败");
		}

	}
}
