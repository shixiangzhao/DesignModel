package com.cienet.abstractfactory.factorymethod;

public class AccessServerUserFactory implements IFactory {

    public IServerUser createServerUser() {
        return new AccessServerUser();
    }

    public IServerDepartment createServerDepartment() {
        return new AccessServerDepartment();
    }
}
