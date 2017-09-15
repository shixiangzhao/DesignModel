package com.cienet.singleton.singletontest;

import com.cienet.singleton.reflecttest.ReflectTest;

public class Company {

	public static void main(String[] args) {
		Printable normalPrinter1 = new NormalPrinter("��ͨ��ӡ��");
		Printable normalPrinter2 = new NormalPrinter("��ͨ��ӡ��2");
		normalPrinter1.print();
		normalPrinter2.print();
		System.out.println("=============================");
		/*
		 * Lazy Loading ������ ����ʽ
		 * 
		 * ����Ҫ��ʱ��Ŵ����������󣬶������������ϵͳ�����л��ߵ��౻���������ص�ʱ��ʹ�����
		 * ��������Ĵ������ߵ�������Ĵ��ڻ����ıȽ϶����Դ����������lazy loading���ԡ� ��������һ�����Ժô�����������ϵͳ��Ч�ʣ���Լ�ڴ���Դ��
		 * 
		 * Warning���̲߳���ȫ
		 */
		Printable lazyPrinter1 = SingletonLazyPrinter.getInstance("������ӡ��");
		Printable lazyPrinter2 = SingletonLazyPrinter.getInstance("��֪����ʲô");

		lazyPrinter1.print();
		lazyPrinter2.print();
		System.out.println("=============================");

		/*
		 * Hungry Loading ����ʽ
		 * 
		 * �ڶ����������͵ĳ�Ա����ʱ�ͽ���ʵ������ ʹ����Singleton�����౻ϵͳ����ʱ���Ѿ���ʵ������һ���������� �Ӷ�һ�����ݵر������̰߳�ȫ�����⡣
		 */
		Printable hungryPrinter1 = SingletonHungryPrinter.getInstance("��Ҫ�ô�ӡ��");
		Printable hungryPrinter2 = SingletonHungryPrinter.getInstance("��ӡ��");

		hungryPrinter1.print();
		hungryPrinter2.print();

		System.out.println("=============================");

		/*
		 * synchronized ͬ����ʽ
		 * 
		 */
//		Printable lockPrinter1 = LockSingletonLazyPrinter.getInstance("ͬ������ӡ��");
//		Printable lockPrinter2 = LockSingletonLazyPrinter.getInstance("ͬ���");
//		lockPrinter1.print();
//		lockPrinter2.print();

		System.out.println("=============================");

		/*
		 * DCL ˫�ؼ��ʽ
		 * 
		 */
//		Printable DCLPrinter1 = DCLSingletonLazyPrinter.getInstance("DCL��ӡ��");
//		Printable DCLPrinter2 = DCLSingletonLazyPrinter.getInstance("DCL");
//		DCLPrinter1.print();
//		DCLPrinter2.print();

		System.out.println("=============================");

		/*
		 * StaticInnerClass ��̬�ڲ���ʽ
		 * 
		 */
		Printable SICPrinter1 = StaticInnerClassSingletonLazyPrinter.getInstance();
		Printable SICPrinter2 = StaticInnerClassSingletonLazyPrinter.getInstance();
		SICPrinter1.print();
		SICPrinter2.print();

		System.out.println("=============================");
		/*
		 * Registration �Ǽ�ʽ
		 * 
		 */
		Printable rgPrinter1 = RegistrationSingletonPrinter.getInstance("��Ҫ�ô�ӡ��", null);
		Printable rgPrinter2 = RegistrationSingletonPrinter.getInstance("��ӡ��", null);

		rgPrinter1.print();
		rgPrinter2.print();

		System.out.println("=============================");

		/*
		 * Enum ö��ʽ
		 * 
		 */
		EnumSingletonPrinter enumPrinter1 = EnumSingletonPrinter.INSTANCE.getInstance("����һ����ӡ��");
		EnumSingletonPrinter enumPrinter2 = EnumSingletonPrinter.INSTANCE.getInstance("��ӡ��");
		enumPrinter1.print();
		enumPrinter2.print();

		System.out.println("=============================");

		try {
			ReflectTest.getReflectInstance();
		} catch (Exception e) {

			System.out.println("��ȡö�ٴ�ӡ��ʧ��");
		}

	}
}
