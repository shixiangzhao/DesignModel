package com.cienet.abstractfactory;

public class SqlServerUser {

    public void insert(User user){
        System.out.println("在Sql Server中给User表增加一条记录");
    }
    
    public User findUser(int id){
        System.out.println("在Sql Server中根据ID得到User表的一条记录");
        return null;
    }
}
