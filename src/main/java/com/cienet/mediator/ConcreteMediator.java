package com.cienet.mediator;

class ConcreteMediator extends Mediator {

    private ConcreteColleague1 c1;
    private ConcreteColleague2 c2;

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == c1) {
            c2.notify(message);
        } else {
            c1.notify(message);
        }
    }

}
