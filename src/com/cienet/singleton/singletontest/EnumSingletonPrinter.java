package com.cienet.singleton.singletontest;

public enum EnumSingletonPrinter {

	INSTANCE("枚举打印机"){

		@Override

		protected EnumSingletonPrinter getInstance(String printerName) {
			return INSTANCE;

		}

		@Override
		public void print() {
			System.out.println("这是枚举打印机");
			
		}

	};

	

	protected abstract EnumSingletonPrinter getInstance(String printerName);
	private String printerName;
	private EnumSingletonPrinter(String printerName) {
		System.out.println("获取枚举打印机");
		this.printerName = printerName;
	}
	public abstract void print();

}
