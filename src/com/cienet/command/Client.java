package com.cienet.command;
/**
 * 烤羊肉串引发的思考：
 * 命令模式，将一个请求封装成为一个对象，从而使你可用不同的请求对客户进行参数化；
 * 对请求排队或记录请求日志，以及支持可撤销的操作。
 * 优点：把请求一个操作的对象与知道怎么执行一个操作的对象分割开。
 * @author shixiang.zhao
 *
 */
public class Client {

    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Command bakeChickenWingCommand2 = new BakeChickenWingCommand(boy);

        Waiter girl = new Waiter();
        girl.setOrder(bakeChickenWingCommand1);
        girl.setOrder(bakeChickenWingCommand2);
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.cancelOrder(bakeMuttonCommand1);

        girl.Notify();
    }

}
