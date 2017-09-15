package com.cienet.singleton.threadtest;

/**
 *˵����ClassLoader����Singleton��ʱ
 *����ʽ�����ͱ�������
 *����ʽ�ڵ�һ�ε���ʱ������
 *
 */
public class TestLoadingTime {
	
	public static void main(String[] args) {

        try {
			Class.forName("com.cienet.singleton.singletontest.SingletonHungryPrinter");
		    Class.forName("com.cienet.singleton.singletontest.SingletonLazyrinter");
		    Class.forName("com.cienet.singleton.singletontest.StaticInnerClassSingletonLazyPrinter");
		} catch (ClassNotFoundException e) {
			System.out.println("����ʽ��ӡ��δ������");
			System.out.println("��̬���ӡ��δ������");


		}

    }

}
