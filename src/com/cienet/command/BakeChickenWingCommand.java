package com.cienet.command;

public class BakeChickenWingCommand extends Command{
    
    public BakeChickenWingCommand(Barbecuer receiver){
        super(receiver);
    }
    
    @Override
    public void excuteCommand(){
        receiver.bakeChickenWing();
    }
}
