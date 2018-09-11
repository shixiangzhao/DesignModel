package com.cienet.singleton.singletontest;

public class SingletonLazyPrinter implements Printable {
	private String printerName;
	private SingletonLazyPrinter(String printerName) {
		this.printerName=printerName;
		System.out.println("获得懒汉打印机");
	}
	
	private static SingletonLazyPrinter lazyPrinter=null;
	public static SingletonLazyPrinter getInstance(String printerName) {  
        if (lazyPrinter == null) {    
        	lazyPrinter = new SingletonLazyPrinter(printerName);  
        }    
       return lazyPrinter;  
   }  
	@Override
	public void print() {
		if(!this.printerName.equals("懒汉打印机")) {
			System.out.println("未找到打印机...");
		}
		else{System.out.println("这是"+printerName);}
	}
	

}
