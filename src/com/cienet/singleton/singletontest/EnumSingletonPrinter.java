package com.cienet.singleton.singletontest;

public enum EnumSingletonPrinter {

	INSTANCE("ö�ٴ�ӡ��"){

		@Override

		protected EnumSingletonPrinter getInstance(String printerName) {
			return INSTANCE;

		}

		@Override
		public void print() {
			System.out.println("����ö�ٴ�ӡ��");
			
		}

	};

	

	protected abstract EnumSingletonPrinter getInstance(String printerName);
	private String printerName;
	private EnumSingletonPrinter(String printerName) {
		System.out.println("��ȡö�ٴ�ӡ��");
		this.printerName = printerName;
	}
	public abstract void print();

}
