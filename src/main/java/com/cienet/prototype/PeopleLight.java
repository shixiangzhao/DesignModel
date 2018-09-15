package com.cienet.prototype;

/**
 * class: PeopleLight <br>
 * 克隆，是复制一份新的空间，而不是复制一份引用
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 14:48
 */
public class PeopleLight implements Cloneable {

    /**
     * 基本类型，浅克隆即可
     */
    private String name = "ilt";
    /**
     * 引用类型，深克隆方可
     */
    private Hand hand = new Hand();

    public Hand getHand() {
        return hand;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PeopleLight p1 = new PeopleLight();
        PeopleLight p2 = (PeopleLight) p1.clone();
        System.out.println("第一个对象的hash值:" + p1.hashCode());
        System.out.println("第二个对象的hash值:" + p2.hashCode());
        System.out.println("-----------分割线-----------");
        System.out.println("p1中的hand对象的hash值:" + p1.getHand().hashCode());
        System.out.println("p2中的hand对象的hash值:" + p2.getHand().hashCode());
    }
}

class Hand implements Cloneable {

}