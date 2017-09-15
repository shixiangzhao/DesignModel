package com.cienet.singleton.singletontest;

public class SingletonLazyPrinter implements Printable {
	private String printerName;
	private SingletonLazyPrinter(String printerName) {
		this.printerName=printerName;
		System.out.println("���������ӡ��");
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
		if(!this.printerName.equals("������ӡ��")) {
			System.out.println("δ�ҵ���ӡ��...");
		}
		else{System.out.println("����"+printerName);}
	}
	

}
