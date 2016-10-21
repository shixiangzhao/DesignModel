package com.cienet.state;

class ConcreteStateA extends State{

    public void handle(Context context){
        context.setState(new ConcreteStateB());
    }
}
