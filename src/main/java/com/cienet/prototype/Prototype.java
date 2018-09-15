package com.cienet.prototype;

/**
 * class: Prototype <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 11:47
 */
public abstract class Prototype implements Cloneable {

    private String id;
    private HandPrototype handPrototype;

    public Prototype(String id, HandPrototype handPrototype) {
        this.id = id;
        this.handPrototype = handPrototype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HandPrototype getHandPrototype() {
        return handPrototype;
    }

    public void setHandPrototype(HandPrototype handPrototype) {
        this.handPrototype = handPrototype;
    }

    //    @Override
//    public abstract Prototype clone();
}

class HandPrototype implements Cloneable{

}