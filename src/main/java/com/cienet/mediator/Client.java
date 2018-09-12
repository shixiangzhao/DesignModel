package com.cienet.mediator;

/**
 * 中介者模式（Mediator），用一个中介对象来封装一些列对象的交互。中介者使得各对象不需要显示的相互引用，
 * 从而使得耦合松散，而且可以独立的改变他们之间的交互。
 * 应用场景：一般应用于一组对象以定义良好但是复杂的方式进行通信的场合，比如Form窗体中的各个控件，都通过窗体来通信，
 * 各个控件却互不认识。还有，想定制一个分布在多个类中的行为，却又不想生成太多的子类。
 * @author Shixiang
 */
public class Client {

    public static void main(String[] args) {
        ConcreteMediator cm = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(cm);
        ConcreteColleague2 c2 = new ConcreteColleague2(cm);

        cm.setC1(c1);
        cm.setC2(c2);

        c1.send("Are you eat?");
        c2.send("Yes, are you?");
    }
}
