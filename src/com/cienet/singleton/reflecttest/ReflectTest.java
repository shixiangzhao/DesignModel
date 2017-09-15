package com.cienet.singleton.reflecttest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.cienet.singleton.singletontest.EnumSingletonPrinter;
import com.cienet.singleton.singletontest.LockSingletonLazyPrinter;

public class ReflectTest {
	
	public static void main(String[] args) {
		try {
			getReflectInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getReflectInstance() throws Exception {  
        
        Class lockClazz = Class.forName("com.cienet.singleton.singletontest.LockSingletonLazyPrinter");  
        Constructor lockCon = lockClazz.getDeclaredConstructor(String.class); 
        lockCon.setAccessible(true);// ����privateȨ�����η�Ϊ�ɼ�  
        LockSingletonLazyPrinter lockPrinter1 = (LockSingletonLazyPrinter) lockCon.newInstance("ͬ������ӡ��");  
        LockSingletonLazyPrinter lockPrinter2 = (LockSingletonLazyPrinter) lockCon.newInstance("asdsda");  
        System.out.println(lockPrinter1 == lockPrinter2); //false  
        System.out.println(lockPrinter1);  
        System.out.println(lockPrinter2);  
        
        
        Class enumClazz = Class.forName("com.cienet.singleton.singletontest.EnumSingletonPrinter");  
        Constructor enumCon =enumClazz.getDeclaredConstructor(String.class);
        lockCon.setAccessible(true);// ����privateȨ�����η�Ϊ�ɼ�  
        EnumSingletonPrinter enumPrinter1 = (EnumSingletonPrinter) enumCon.newInstance("ͬ������ӡ��");  
        EnumSingletonPrinter enumPrinter2 = (EnumSingletonPrinter) enumCon.newInstance("asdsda");  
        System.out.println(enumPrinter1 == enumPrinter2); //false  
        System.out.println(enumPrinter1);  
        System.out.println(enumPrinter2);  
        
    }  
}
