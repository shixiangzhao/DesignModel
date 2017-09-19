package com.cienet.singleton.threadtest;

import java.util.Date;

import com.cienet.singleton.singletontest.StaticInnerClassSingletonLazyPrinter;

public class SICTest {
	
	public static void main(String[] args) {
		Date startTime =new Date();
		Runnable SICLazyPrinterRunner = () -> StaticInnerClassSingletonLazyPrinter.getInstance();
		for (int i = 0; i < 5; i++) {
			Thread SICLazyPrinterThread = new Thread(SICLazyPrinterRunner);
			SICLazyPrinterThread.start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Date endTime =new Date();
		
		System.out.println("运行时长:"+(endTime.getTime()-startTime.getTime())+"ms");


		

	}

}
