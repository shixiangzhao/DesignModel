package com.cienet.singleton.singletontest;

public class NormalPrinter implements Printable {
	private String printerName;

	public NormalPrinter(String printerName) {
		this.printerName=printerName;

	}

	@Override
	public void print() {
		if (!this.printerName.equals("��ͨ��ӡ��")) {
			System.out.println("δ�ҵ���ӡ��");

		} else {
			System.out.println("����" + printerName);
		}
	}

}
