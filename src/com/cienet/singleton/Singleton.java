package com.cienet.singleton;

/**
 * 懒汉，线程不安全 
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 * 
 * @author Shixiang
 *
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public Singleton getInstance() {
		if (instance != null) {
			instance = new Singleton();
		}
		return new Singleton();
	}
}
