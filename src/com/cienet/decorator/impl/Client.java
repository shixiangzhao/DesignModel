package com.cienet.decorator.impl;

/**
 * 小菜穿衣打扮的设计： 
 * 装饰模式是为已有的功能添加更多的功能的一种方式。
 * 当系统需要新功能时，是向旧的类中添加新的代码，这些新加的代码通常装饰了原有类的核心职责或主要行为。
 * 这种做法的问题在于，它们在主类中加入了新的字段，新的方法和新的逻辑，从而增加了主类的复杂度。
 * 就像最初你就是一个“人”类，新加入的东西仅仅是为了满足一些只在某种特定情况下才会执行的特殊行为的需要。
 * 装饰模式吧每个装饰功能放在单独的类中，并让这个类包装它所要装饰的对象。
 * 当需要执行特殊行为时，客户端就可以在运行时根据需要有选择地，按顺序的使用装饰功能包装对象了。
 * 优点在于，把类中的装饰功能从类中搬出去，这样可以简化原有的类，而且可以去除相关类中重复的装饰逻辑。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person("小菜");
        
        System.out.println("第一种装扮：");
        
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        
        sneakers.setComponent(person);
        bigTrouser.setComponent(sneakers);
        tShirts.setComponent(bigTrouser);
        tShirts.show();
        
        System.out.println("第二种装扮：");
        
        LeatherShoes leatherShoes = new LeatherShoes();
        Tie tie = new Tie();
        Suit suit = new Suit();
        
        leatherShoes.setComponent(person);
        tie.setComponent(leatherShoes);
        suit.setComponent(tie);
        suit.show();        
    }

}
