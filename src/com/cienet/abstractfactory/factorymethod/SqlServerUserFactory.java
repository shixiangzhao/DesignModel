package com.cienet.abstractfactory.factorymethod;

public class SqlServerUserFactory implements IFactory {

    public IServerUser createServerUser() {
        return new SqlServerUser();
    }

    public IServerDepartment createServerDepartment() {
        return new SqlServerDepartment();
    }
}
