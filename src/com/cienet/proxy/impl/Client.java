package com.cienet.proxy.impl;
/**
 * 为他人做嫁衣裳之代理模式设计：
 * 代理模式，为其他对象提供一种代理以控制对这个对象的访问。
 * 1. 远程代理，为一个对象在不同的地址空间提供局部代表，这样可以隐藏一个对象存在于不同的地址空间这样的事实。
 * 2. 虚拟代理，根据需要创建开销很大的对象，通过它来存放实例化需要很长时间的真实对象。
 * 3. 安全代理，用来控制真实对象访问时的权限。
 * 4. 智能指引，当调用真实对象时，代理处理另外一些事，使得调用前后逻辑更加智能。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        SchoolGirl gaolihua = new SchoolGirl();
        gaolihua.setName("高莉华");
        Proxy proxy = new Proxy(gaolihua);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
