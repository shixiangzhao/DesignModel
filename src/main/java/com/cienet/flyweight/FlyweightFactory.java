package com.cienet.flyweight;

import java.util.Hashtable;

/**
 * class: FlyweightFactory <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 16:18
 */
public class FlyweightFactory {

    private Hashtable<String, Flyweight> flyWeights = new Hashtable<>();

    public FlyweightFactory() {
        flyWeights.put("X", new ConcreteFlyweight());
        flyWeights.put("Y", new ConcreteFlyweight());
        flyWeights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyWeights.get(key);
    }

}