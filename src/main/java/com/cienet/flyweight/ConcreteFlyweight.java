package com.cienet.flyweight;

/**
 * class: ConcreteFlyweight <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 16:07
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int state) {
        System.out.println(this.getClass().getName() + ": " + state);
    }
}