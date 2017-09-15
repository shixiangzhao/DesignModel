package com.cienet.singleton.singletontest;

public class DCLSingletonLazyPrinter implements Printable {
	 
	public static int counter=0;

	private String printerName;

	private DCLSingletonLazyPrinter(String printerName) {
		
		this.printerName = printerName;
		System.out.println("���DCL��ӡ��");
	}

	private static volatile DCLSingletonLazyPrinter DCLLazyPrinter = null;

	public static DCLSingletonLazyPrinter getInstance(String printerName) {
		if (DCLLazyPrinter == null) {
			synchronized (DCLSingletonLazyPrinter.class) {
				
				if (DCLLazyPrinter == null) {
					DCLLazyPrinter = new DCLSingletonLazyPrinter(printerName);
				}
				counter++;
				
			}
		}
		return DCLLazyPrinter;
	}

	@Override
	public void print() {
		if (!this.printerName.equals("DCL��ӡ��")) {
			System.out.println("δ�ҵ���ӡ��...");
		} else {
			System.out.println("����" + printerName);
		}
	}

}
