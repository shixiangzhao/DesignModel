package com.cienet.singleton.threadtest;

/**
 *说明在ClassLoader加载Singleton类时
 *饿汉式单例就被创建。
 *懒汉式在第一次调用时创建。
 *
 */
public class TestLoadingTime {
	
	public static void main(String[] args) {

        try {
			Class.forName("com.cienet.singleton.singletontest.SingletonHungryPrinter");
		    Class.forName("com.cienet.singleton.singletontest.SingletonLazyrinter");
		    Class.forName("com.cienet.singleton.singletontest.StaticInnerClassSingletonLazyPrinter");
		} catch (ClassNotFoundException e) {
			System.out.println("懒汉式打印机未被创建");
			System.out.println("静态类打印机未被创建");


		}

    }

}