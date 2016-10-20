package com.cienet.abstractfactory.simplefactory;

import com.cienet.abstractfactory.factorymethod.SqlServerUser;
import com.cienet.abstractfactory.factorymethod.AccessServerDepartment;
import com.cienet.abstractfactory.factorymethod.AccessServerUser;
import com.cienet.abstractfactory.factorymethod.IServerDepartment;
import com.cienet.abstractfactory.factorymethod.IServerUser;
import com.cienet.abstractfactory.factorymethod.SqlServerDepartment;

public class DataAccess {

    //private static final String db = "Sql Server";
    private static final String db = "Access";

    public static IServerUser createUser() {
        IServerUser iServerUser = null;
        switch (db) {
        case "Sql Server":
            iServerUser = (IServerUser) new SqlServerUser();
            break;
        case "Access":
            iServerUser = (IServerUser) new AccessServerUser();
            break;
        }
        return iServerUser;
    }

    public static IServerDepartment createDepartment() {
        IServerDepartment iServerDepartment = null;
        switch (db) {
        case "Sql Server":
            iServerDepartment = (IServerDepartment) new SqlServerDepartment();
            break;
        case "Access":
            iServerDepartment = (IServerDepartment) new AccessServerDepartment();
            break;
        }
        return iServerDepartment;
    }
}
