package com.cienet.singleton.singletontest;

public class SingletonHungryPrinter implements Printable{
	
	private String printerName;
	private SingletonHungryPrinter(String printerName) {
	this.printerName=printerName;
		System.out.println("��ö�����ӡ��");
	}
	
	private static SingletonHungryPrinter hungryPrinter=new SingletonHungryPrinter("������ӡ��");
	public static SingletonHungryPrinter getInstance(String printerName) {  
       
       return hungryPrinter;  
   }  
	@Override
	public void print() {
		if(!this.printerName.equals("������ӡ��")) {
			System.out.println("δ�ҵ���ӡ��...");
		}
		else{System.out.println("����"+printerName);}
	}

}
