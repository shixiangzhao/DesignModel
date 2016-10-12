package com.cienet.factorymethod;

public class SimpleFactory {
    public static LeiFeng createLeiFeng(String type){
        LeiFeng result = null;
        switch (type) {
        case "1":
            result = new Undergraduate();
            break;
        case "2":
            result = new Volunteer();
            break;

        default:
            break;
        }
        return result;
    }
}
