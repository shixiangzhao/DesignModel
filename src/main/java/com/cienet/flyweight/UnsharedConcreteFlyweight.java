package com.cienet.flyweight;

/**
 * class: UnsharedConcreteFlyweight <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 16:07
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int state) {
        System.out.println(this.getClass().getName() + ": " + state);
    }
}