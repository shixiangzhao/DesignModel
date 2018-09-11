package com.cienet.singleton;

/**
 * 静态内部类，只有显示通过调用getInstance方法时， 
 * 才会显示装载SingletonHolder类，从而实例化instance。
 * 
 * @author Shixiang
 *
 */
public class Singleton5 {

	private static class Singleton5Holder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {
	}

	public static Singleton5 getInstance() {
		return Singleton5Holder.INSTANCE;
	}
}
