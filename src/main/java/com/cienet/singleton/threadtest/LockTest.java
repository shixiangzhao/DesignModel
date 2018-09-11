package com.cienet.singleton.threadtest;

import java.util.Date;

import com.cienet.singleton.singletontest.DCLSingletonLazyPrinter;
import com.cienet.singleton.singletontest.LockSingletonLazyPrinter;


public class LockTest {

	public static void main(String[] args) {
		Date startTime =new Date();
		Runnable lockLazyPrinterRunner = () -> LockSingletonLazyPrinter.getInstance("同步锁打印机");
		for (int i = 0; i < 5; i++) {
			Thread lockLazyPrinterThread = new Thread(lockLazyPrinterRunner);
			lockLazyPrinterThread.start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Date endTime =new Date();
		
		System.out.println("运行时长:"+(endTime.getTime()-startTime.getTime())+"ms");
		System.out.println("进入临界区"+(LockSingletonLazyPrinter.getInstance("DCL打印机").counter-1)+"次");


		

	}
}
