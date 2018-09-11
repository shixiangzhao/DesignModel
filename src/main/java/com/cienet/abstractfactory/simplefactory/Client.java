package com.cienet.abstractfactory.simplefactory;

import com.cienet.abstractfactory.factorymethod.Department;
import com.cienet.abstractfactory.factorymethod.IServerDepartment;
import com.cienet.abstractfactory.factorymethod.IServerUser;
import com.cienet.abstractfactory.factorymethod.User;

/**
 * 简单工厂模式
 * 一处修改，即可更改数据库配置。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();
        
        IServerUser iServerUser = DataAccess.createUser();
        iServerUser.insert(user);
        iServerUser.findUser(1);
        
        System.out.println("----------------------------------");
        IServerDepartment iServerDepartment = DataAccess.createDepartment();
        iServerDepartment.insert(department);
        iServerDepartment.findDepartment(1);
    }
}
