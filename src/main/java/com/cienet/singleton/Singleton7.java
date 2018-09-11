package com.cienet.singleton;

/**
 * 双重校验锁，在JDK1.5之后，双重检查锁定才能够正常达到单例效果。
 * 
 * @author Shixiang
 *
 */
public class Singleton7 {

	private volatile static Singleton7 instance;

	private Singleton7() {
	}

	public static Singleton7 getInstance() {
		if (instance == null) {
			synchronized (Singleton7.class) {
				if (instance == null) {
					instance = new Singleton7();
				}
			}
		}
		return instance;
	}
}
