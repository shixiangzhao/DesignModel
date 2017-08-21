package com.cienet.abstractfactory.factorymethod;

public class AccessServerUser implements IServerUser {

    public void insert(User user) {
        System.out.println("在Access中给User表增加一条记录");
    }

    public User findUser(int id) {
        System.out.println("在Access中根据ID得到User表的一条记录");
        return null;
    }
}
