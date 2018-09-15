package com.cienet.prototype;

/**
 * class: Client <br>
 * 原型模式（Prototype），用原型实例指定创建对象的种类，并且通过
 * 拷贝这些原型创建新的对象。
 * 原型模式，其实就是从一个对象再创建另外一个可定制的对象，而且不需
 * 知道任何创建的细节。
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 11:52
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype p1 = new ConcretePrototype("I", new HandPrototype());
        ConcretePrototype c1 = (ConcretePrototype) p1.clone();
        System.out.println("Cloned: " + c1.getId());
        System.out.println("本体的hash地址：" + p1.hashCode());
        System.out.println("备份的hash地址：" + c1.hashCode());
        System.out.println("本体中引用hand的hash地址：" + p1.getHandPrototype().hashCode());
        System.out.println("备份中引用hand的hash地址：" + c1.getHandPrototype().hashCode());
        System.out.println("本体中String的hash地址: " + p1.getId().hashCode());
        System.out.println("备份中String的hash地址: " + c1.getId().hashCode());
    }
}