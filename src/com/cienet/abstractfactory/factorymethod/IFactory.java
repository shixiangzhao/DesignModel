package com.cienet.abstractfactory.factorymethod;

interface IFactory {

    IServerUser createServerUser();

    IServerDepartment createServerDepartment();
}
