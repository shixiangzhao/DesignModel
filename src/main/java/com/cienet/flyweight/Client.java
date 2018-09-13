package com.cienet.flyweight;

/**
 * 享元模式：运用共享技术，有效的支持大量细粒度的对象。可以避免大量非常相似类的开销。
 * 应用场景：应用程序使用了大量对象，占用了大量的内存开销。就应该考虑使用。
 * class: Client <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 16:24
 */
public class Client {

    public static void main(String[] args) {
        int state = 22;
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweightX = flyweightFactory.getFlyweight("X");
        flyweightX.operation(--state);

        Flyweight flyweightY = flyweightFactory.getFlyweight("Y");
        flyweightY.operation(--state);

        Flyweight flyweightZ = flyweightFactory.getFlyweight("Z");
        flyweightZ.operation(--state);

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.operation(--state);
    }
}