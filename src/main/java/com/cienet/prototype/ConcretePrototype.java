package com.cienet.prototype;

/**
 * class: ConcretePrototype <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 11:48
 */
public class ConcretePrototype extends Prototype {

    public ConcretePrototype(String id, HandPrototype handPrototype) {
        super(id, handPrototype);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}