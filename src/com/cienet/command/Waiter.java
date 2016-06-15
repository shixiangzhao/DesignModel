package com.cienet.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
    
    private List<Command> orders = new ArrayList<Command>();
    
    public void setOrder(Command command){
        if(command.toString() == "meiyyou"){
            System.out.println("服务员：鸡翅没有了，请点别的烧烤！");
        }else{
            orders.add(command);
            System.out.println("增加订单： " + command.toString() + 
                " 时间：" + new Date().toString());
        }
    }
    
    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单： " + command.toString() + 
            " 时间：" + new Date().toString());
    }
    
    public void Notify(){
        for(Command cmd : orders){
            cmd.excuteCommand();
        }
    }
}
