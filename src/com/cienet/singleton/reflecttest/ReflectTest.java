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
        
        Class lockClazz = Class.forName("com.lh.singletontest.LockSingletonLazyPrinter");  
        Constructor lockCon = lockClazz.getDeclaredConstructor(String.class); 
        lockCon.setAccessible(true);// 设置private权限修饰符为可见  
        LockSingletonLazyPrinter lockPrinter1 = (LockSingletonLazyPrinter) lockCon.newInstance("同步锁打印机");  
        LockSingletonLazyPrinter lockPrinter2 = (LockSingletonLazyPrinter) lockCon.newInstance("asdsda");  
        System.out.println(lockPrinter1 == lockPrinter2); //false  
        System.out.println(lockPrinter1);  
        System.out.println(lockPrinter2);  
        
        
        Class enumClazz = Class.forName("com.lh.singletontest.EnumSingletonPrinter");  
        Constructor enumCon =enumClazz.getDeclaredConstructor(String.class);
        lockCon.setAccessible(true);// 设置private权限修饰符为可见  
        EnumSingletonPrinter enumPrinter1 = (EnumSingletonPrinter) enumCon.newInstance("同步锁打印机");  
        EnumSingletonPrinter enumPrinter2 = (EnumSingletonPrinter) enumCon.newInstance("asdsda");  
        System.out.println(enumPrinter1 == enumPrinter2); //false  
        System.out.println(enumPrinter1);  
        System.out.println(enumPrinter2);  
        
    }  
}
