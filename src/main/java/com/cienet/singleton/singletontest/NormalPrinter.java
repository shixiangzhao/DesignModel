package com.cienet.singleton.singletontest;

public class NormalPrinter implements Printable {
	private String printerName;

	public NormalPrinter(String printerName) {
		this.printerName=printerName;

	}

	@Override
	public void print() {
		if (!this.printerName.equals("普通打印机")) {
			System.out.println("未找到打印机");

		} else {
			System.out.println("这是" + printerName);
		}
	}

}