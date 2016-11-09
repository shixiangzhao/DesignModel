package com.cienet.abstractfactory.factorymethod;

public class SqlServerFactory implements IFactory {

    public IServerUser createServerUser() {
        return new SqlServerUser();
    }

    public IServerDepartment createServerDepartment() {
        return new SqlServerDepartment();
    }
}
