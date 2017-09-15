package com.cienet.singleton.singletontest;

public class StaticInnerClassSingletonLazyPrinter implements Printable {

	private String printerName;

	private StaticInnerClassSingletonLazyPrinter(String printerName) {
		this.printerName = printerName;
		System.out.println("��þ�̬���ӡ��");
	}

	public static StaticInnerClassSingletonLazyPrinter getInstance() {

		return PrinterGiver.SICLazyPrinter;
	}

	private static class PrinterGiver {
		private static StaticInnerClassSingletonLazyPrinter SICLazyPrinter = new StaticInnerClassSingletonLazyPrinter(
				"��̬���ӡ��");
	}

	@Override
	public void print() {
		if (!this.printerName.equals("��̬���ӡ��")) {
			System.out.println("δ�ҵ���ӡ��...");
		} else {
			System.out.println("����" + printerName);
		}
	}

}
