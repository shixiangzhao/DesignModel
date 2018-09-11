package com.cienet.composite;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    /*
     * 透明方式，使得继承了Component的子对象都具有add和remove方法
     * 也可以采用安全方式，去掉Component的add和remove方法，但这样对于一个Component对象需要判断是叶子不是。
     * @see com.cienet.composite.Component#add(com.cienet.composite.Component)
     */
    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf.");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf.");
    }
}
