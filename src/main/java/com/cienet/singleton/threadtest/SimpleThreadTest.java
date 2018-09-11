package com.cienet.singleton.threadtest;

import com.cienet.singleton.singletontest.SingletonHungryPrinter;
import com.cienet.singleton.singletontest.SingletonLazyPrinter;

public class SimpleThreadTest {
	/** 
	 * 在多线程的情况下,简单的懒汉式单例不止一次被实例化，线程不安全
	 * 饿汉式线程安全
	 * 
	 **/
	
	public static void main(String[] args) {
		
		Runnable lazyPrinterRunner =()->SingletonLazyPrinter.getInstance("懒汉打印机");
		for(int i=0;i<5;i++) {
			Thread lazyPrinterThread =new Thread(lazyPrinterRunner);
			lazyPrinterThread.start();
		}
		
		System.out.println("-----------------------------");
		
		Runnable hungryPrinterRunner =()->SingletonHungryPrinter.getInstance("饿汉打印机");
		for(int i=0;i<5;i++) {
			Thread hungryPrinterThread =new Thread(hungryPrinterRunner);
			hungryPrinterThread.start();
		}
		
	
	}

}
