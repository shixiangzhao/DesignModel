package com.cienet.singleton.singletontest;

/**
 * 解决了线程问题，但会有大量线程进入等待状态
 */
public class LockSingletonLazyPrinter implements Printable {
	public static int counter = 0;
	private String printerName;

	private LockSingletonLazyPrinter(String printerName) {
		this.printerName = printerName;
		System.out.println("获得同步锁打印机");
	}

	private static LockSingletonLazyPrinter lockLazyPrinter = null;

	public static synchronized LockSingletonLazyPrinter getInstance(String printerName) {
		counter++;

		if (lockLazyPrinter == null) {
			lockLazyPrinter = new LockSingletonLazyPrinter(printerName);
		}
		return lockLazyPrinter;

	}

	@Override
	public void print() {
		if (!this.printerName.equals("同步锁打印机")) {
			System.out.println("未找到打印机...");
		} else {
			System.out.println("这是" + printerName);
		}
	}

}