package com.cienet.abstractfactory.factorymethod;

public class AccessServerDepartment implements IServerDepartment{

    public void insert(Department department){
        System.out.println("在Access中给Department表增加一条记录");
    }
    
    public User findDepartment(int id){
        System.out.println("在Access中根据ID得到Department表的一条记录");
        return null;
    }
}
