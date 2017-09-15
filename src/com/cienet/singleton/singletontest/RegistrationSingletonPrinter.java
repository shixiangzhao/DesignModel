package com.cienet.singleton.singletontest;

import java.util.HashMap;


public class RegistrationSingletonPrinter implements Printable {
	private String printerName;
	
    private static HashMap<String,RegistrationSingletonPrinter> printerMap =new HashMap<String,RegistrationSingletonPrinter>();
    static{  
    	RegistrationSingletonPrinter RgPrinter = new RegistrationSingletonPrinter("�ǼǴ�ӡ��");  
    	printerMap.put(RgPrinter.getClass().getName(), RgPrinter);  
    }  
    
    protected RegistrationSingletonPrinter(String printerName){
    	this.printerName=printerName;
    	System.out.println("��ȡ�ǼǴ�ӡ��");
    }
    /**
     * 
     * @param printerName ��ӡ������
     * @param className   ʵ�������ƣ���֪����null
     * @return ��ӡ��
     */
    public static RegistrationSingletonPrinter getInstance(String printerName,String className) { 
    	if(className==null) {
    		className= RegistrationSingletonPrinter.class.getName();  
    	}
        if(!className.equals("com.cienet.singleton.singletontest.RegistrationSingletonPrinter")) {  
        	className = RegistrationSingletonPrinter.class.getName();  
            System.out.println("className == null"+"--->className="+className);  
        }  
        if(printerMap.get(className) == null) {  
            try {  
            	printerMap.put(className, (RegistrationSingletonPrinter) Class.forName("com.cienet.singleton.singletontest.RegistrationSingletonPrinter").newInstance());  
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
    	if (!this.printerName.equals("�ǼǴ�ӡ��")) {
			System.out.println("δ�ҵ���ӡ��...");
		} else {
			System.out.println("����" + printerName);
		}
	
		
	}

}
