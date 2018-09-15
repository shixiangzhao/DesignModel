package com.cienet.prototype;

/**
 * class: PeopleDeep <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 14:58
 */
public class PeopleDeep implements Cloneable {
    private String name = "ilt";
    private HandDeep handDeep = new HandDeep();

    public HandDeep getHandDeep() {
        return handDeep;
    }

    public void setHandDeep(HandDeep handDeep) {
        this.handDeep = handDeep;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PeopleDeep p2 = (PeopleDeep) super.clone();
        p2.setHandDeep((HandDeep) handDeep.clone());
        return p2;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PeopleDeep p1 = new PeopleDeep();
        PeopleDeep p2 = (PeopleDeep) p1.clone();
        System.out.println("第一个对象的hash值:" + p1.hashCode());
        System.out.println("第二个对象的hash值:" + p2.hashCode());
        System.out.println("-----------分割线-----------");
        System.out.println("p1中的hand对象的hash值:" + p1.getHandDeep().hashCode());
        System.out.println("p2中的hand对象的hash值:" + p2.getHandDeep().hashCode());
    }
}


class HandDeep implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}