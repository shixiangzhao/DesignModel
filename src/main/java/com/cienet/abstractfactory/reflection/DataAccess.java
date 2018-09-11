package com.cienet.abstractfactory.reflection;

import com.cienet.abstractfactory.factorymethod.IServerDepartment;
import com.cienet.abstractfactory.factorymethod.IServerUser;

public class DataAccess {

    public static IServerUser createUser()
        throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String className = "com.cienet.abstractfactory.factorymethod.SqlServerUser";
        IServerUser iServerUser = (IServerUser) Class.forName(className).newInstance();
        return iServerUser;
    }

    public static IServerDepartment createDepartment()
        throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String className = "com.cienet.abstractfactory.factorymethod.SqlServerDepartment";
        IServerDepartment iServerDepartment = (IServerDepartment) Class.forName(className).newInstance();
        return iServerDepartment;
    }
}
