package com.cienet.singleton;

import java.io.Serializable;

/**
 * 序列化和复原问题
 * 如果Singleton实现了java.io.Serializable接口，那么这个类的实例就可能被序列化和复原。
 * 不管怎样，如果你序列化一个单例类的对象，接下来复原多个那个对象，那你就会有多个单例类的实例。
 * 
 * @author Shixiang
 *
 */
public class Singleton8 implements Serializable {

	private static final long serialVersionUID = 1L;

	private static Singleton8 INSTANCE = new Singleton8();

	private Singleton8() {
	}

	public static Singleton8 getInstance() {
		return INSTANCE;
	}
}
