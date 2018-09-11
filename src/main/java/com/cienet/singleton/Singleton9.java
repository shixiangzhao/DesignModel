package com.cienet.singleton;

import java.io.Serializable;

/**
 * 多个类装载器问题
 * 如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。
 * 假定不是远端存取，例如一些servlet容器对每个servlet使用完全不同的类装载器，
 * 这样的话如果有两个servlet访问一个单例类，它们就都会有各自的实例。
 * 
 * @author Shixiang
 *
 */
public class Singleton9 implements Serializable {

	private static final long serialVersionUID = -3882024835979199419L;

	private static Singleton9 INSTANCE = new Singleton9();

	private Singleton9() {
	}

	public static Singleton9 getInstance() {
		return INSTANCE;
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	private static Class getClass(String classname) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		if (classLoader == null) {
			classLoader = Singleton9.class.getClassLoader();
		}
		return classLoader.loadClass(classname);
	}
}
