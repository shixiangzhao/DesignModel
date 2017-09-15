package com.cienet.singleton.threadtest;

import com.cienet.singleton.singletontest.SingletonHungryPrinter;
import com.cienet.singleton.singletontest.SingletonLazyPrinter;

public class SimpleThreadTest {
	/** 
	 * �ڶ��̵߳������,�򵥵�����ʽ������ֹһ�α�ʵ�������̲߳���ȫ
	 * ����ʽ�̰߳�ȫ
	 * 
	 **/
	
	public static void main(String[] args) {
		
		Runnable lazyPrinterRunner =()->SingletonLazyPrinter.getInstance("������ӡ��");
		for(int i=0;i<5;i++) {
			Thread lazyPrinterThread =new Thread(lazyPrinterRunner);
			lazyPrinterThread.start();
		}
		
		
		
		Runnable hungryPrinterRunner =()->SingletonHungryPrinter.getInstance("������ӡ��");
		for(int i=0;i<5;i++) {
			Thread hungryPrinterThread =new Thread(hungryPrinterRunner);
			hungryPrinterThread.start();
		}
		
	
	}

}
