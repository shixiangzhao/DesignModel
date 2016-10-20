package com.cienet.abstractfactory.reflection;

import com.cienet.abstractfactory.factorymethod.Department;
import com.cienet.abstractfactory.factorymethod.IServerDepartment;
import com.cienet.abstractfactory.factorymethod.IServerUser;
import com.cienet.abstractfactory.factorymethod.User;

/**
 * 反射 + 抽象工厂模式
 * 所有在用简单工厂的地方，都可以考虑用反射技术来去除switch或if，解除分支判断带来的耦合。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException {
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
