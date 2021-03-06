package com.cienet.singleton.threadtest;

import java.util.Date;

import com.cienet.singleton.singletontest.DCLSingletonLazyPrinter;

public class DCLTest {
	
	public static void main(String[] args) {
		Date startTime =new Date();

		Runnable DCLLazyPrinterRunner = () -> DCLSingletonLazyPrinter.getInstance("DCL打印机");
		for (int i = 0; i < 5; i++) {
			Thread DCLLazyPrinterThread = new Thread(DCLLazyPrinterRunner);
			DCLLazyPrinterThread.start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Date endTime =new Date();
		
		System.out.println("运行时长:"+(endTime.getTime()-startTime.getTime())+"ms");
		System.out.println("进入临界区"+DCLSingletonLazyPrinter.getInstance("DCL打印机").counter+"次");
		


	}

}
