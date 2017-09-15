package com.cienet.singleton.singletontest;

/**
 * ������߳����⣬�����д����߳̽���ȴ�״̬
 */
public class LockSingletonLazyPrinter implements Printable {
	public static int counter = 0;
	private String printerName;

	private LockSingletonLazyPrinter(String printerName) {
		this.printerName = printerName;
		System.out.println("���ͬ������ӡ��");
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
		if (!this.printerName.equals("ͬ������ӡ��")) {
			System.out.println("δ�ҵ���ӡ��...");
		} else {
			System.out.println("����" + printerName);
		}
	}

}
