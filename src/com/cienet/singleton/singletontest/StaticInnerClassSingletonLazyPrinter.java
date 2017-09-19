package com.cienet.singleton.singletontest;

public class StaticInnerClassSingletonLazyPrinter implements Printable {

	private String printerName;

	private StaticInnerClassSingletonLazyPrinter(String printerName) {
		this.printerName = printerName;
		System.out.println("Set the static printer");
	}

	public static StaticInnerClassSingletonLazyPrinter getInstance() {

		return PrinterGiver.SICLazyPrinter;
	}

	private static class PrinterGiver {
		private static StaticInnerClassSingletonLazyPrinter SICLazyPrinter = new StaticInnerClassSingletonLazyPrinter(
				"Static Printer");
	}

	@Override
	public void print() {
		if (!this.printerName.equals("Static Printer")) {
			System.out.println("Can't find printer!");
		} else {
			System.out.println("This is " + printerName);
		}
	}

}
