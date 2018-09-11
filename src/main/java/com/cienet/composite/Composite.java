package com.cienet.composite;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Component c : children) {
            c.display(depth + 2);
        }
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }
}
