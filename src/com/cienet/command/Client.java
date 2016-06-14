package com.cienet.command;

public class Client {

    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();
        
        girl.setOrder(bakeChickenWingCommand1);
        girl.Notify();
        girl.setOrder(bakeMuttonCommand1);
        girl.Notify();
        girl.setOrder(bakeMuttonCommand2);
        girl.Notify();
    }

}
