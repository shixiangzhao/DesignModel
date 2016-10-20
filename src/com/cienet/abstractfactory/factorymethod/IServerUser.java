package com.cienet.abstractfactory.factorymethod;

public interface IServerUser {

    void insert(User user);

    User findUser(int id);
}
