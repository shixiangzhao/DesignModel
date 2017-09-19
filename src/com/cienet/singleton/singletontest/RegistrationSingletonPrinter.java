package com.cienet.singleton.singletontest;

import java.util.HashMap;


public class RegistrationSingletonPrinter implements Printable {
	private String printerName;
	
    private static HashMap<String,RegistrationSingletonPrinter> printerMap =new HashMap<String,RegistrationSingletonPrinter>();
    static{  
    	RegistrationSingletonPrinter RgPrinter = new RegistrationSingletonPrinter("登记打印机");  
    	printerMap.put(RgPrinter.getClass().getName(), RgPrinter);  
    }  
    
    protected RegistrationSingletonPrinter(String printerName){
    	this.printerName=printerName;
    	System.out.println("获取登记打印机");
    }
    /**
     * 
     * @param printerName 打印机名称
     * @param className   实现类名称，不知道填null
     * @return 打印机
     */
    public static RegistrationSingletonPrinter getInstance(String printerName,String className) { 
    	if(className==null) {
    		className= RegistrationSingletonPrinter.class.getName();  
    	}
        if(!className.equals("com.lh.singletontest.RegistrationSingletonPrinter")) {  
        	className = RegistrationSingletonPrinter.class.getName();  
            System.out.println("className == null"+"--->className="+className);  
        }  
        if(printerMap.get(className) == null) {  
            try {  
            	printerMap.put(className, (RegistrationSingletonPrinter) Class.forName("com.lh.singletontest.RegistrationSingletonPrinter").newInstance());  
            } catch (InstantiationException e) {  
                e.printStackTrace();  
            } catch (IllegalAccessException e) {  
                e.printStackTrace();  
            } catch (ClassNotFoundException e) {  
                e.printStackTrace();  
            }  
        }  
        return printerMap.get(className);  
    }  
    @Override
	public void print() {
    	if (!this.printerName.equals("登记打印机")) {
			System.out.println("未找到打印机...");
		} else {
			System.out.println("这是" + printerName);
		}
	
		
	}

}
