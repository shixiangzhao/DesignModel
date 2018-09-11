package com.cienet.singleton.singletontest;

public class SingletonHungryPrinter implements Printable{
	
	private String printerName;
	private SingletonHungryPrinter(String printerName) {
	this.printerName=printerName;
		System.out.println("获得饿汉打印机");
	}
	
	private static SingletonHungryPrinter hungryPrinter=new SingletonHungryPrinter("饿汉打印机");
	public static SingletonHungryPrinter getInstance(String printerName) {  
       
       return hungryPrinter;  
   }  
	@Override
	public void print() {
		if(!this.printerName.equals("饿汉打印机")) {
			System.out.println("未找到打印机...");
		}
		else{System.out.println("这是"+printerName);}
	}

}
