package com.cienet.state;

class ConcreteStateB extends State{

    public void handle(Context context){
        context.setState(new ConcreteStateA());
    }
}
