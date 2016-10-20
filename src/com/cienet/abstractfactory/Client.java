package com.cienet.abstractfactory;

public class Client {

    public static void main(String[] args) {
        User user = new User();
        SqlServerUser sUser = new SqlServerUser();
        sUser.insert(user);
        sUser.findUser(1);

        System.out.println("-----------------------------------");
        AccessServerUser aUser = new AccessServerUser();
        aUser.insert(user);
        aUser.findUser(1);
    }
}
