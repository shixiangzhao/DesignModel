package com.cienet.command;

public abstract class Command {
    
    protected Barbecuer receiver;
    
    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }
    
    abstract public void excuteCommand();
}
