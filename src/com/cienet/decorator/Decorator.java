package com.cienet.decorator;

public abstract class Decorator extends Component{ // 只有继承Component，才能装饰ConcreteComponent。
    
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }
    
    @Override
    public void operation(){
        if (component != null) {
            component.operation();
        }
    }
}
