package com.cienet.abstractfactory.factorymethod;

public class AccessServerFactory implements IFactory {

    public IServerUser createServerUser() {
        return new AccessServerUser();
    }

    public IServerDepartment createServerDepartment() {
        return new AccessServerDepartment();
    }
}
