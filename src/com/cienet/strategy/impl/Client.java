package com.cienet.strategy.impl;

/**
 * 商场促销模式的设计： 
 * 策略模式是一种定义一系列算法的方法，所有这些算法完成的都是相同的工作，只是实现不同，
 * 即可以以相同的方式调用所有的算法，这样减少了各种算法类与调用算法类之间的耦合。
 * 策略模式的Strategy类层次为Context定义了一系列可供重用的算法或行为。继承有助于提取出这些算法类中的公共功能。
 * 策略模式的一个优点是简化的单元测试，因为每个算法都有自己的实现类，可以通过自己的借口单独测试。
 * 这样修改一个不会影响其他算法类。策略模式封装了变化。
 * 策略模式就是用来封装算法的，但在实践中，我们发现可以用它来封装几乎任何类型的规则，
 * 只要在分析过程中听到需要在不同的场景应用不同的业务规则，就可以考虑使用策略模式处理这种变化的可能性。
 * @author shixiang.zhao
 */
public class Client {
    public static void main(String[] args) {
        String type = "2";
        double originalPrice = 1500;
        /*
        CashContext cashContext = null;
        switch (type){
        case "1":
            cashContext = new CashContext(new CashNormal());
            break;
        case "2":
            cashContext = new CashContext(new CashRebate(0.8));
            break;
        case "3":
            cashContext = new CashContext(new CashReturn(300, 100));
            break;
        
        default:
            break;
        }
        */
        /*
        // 简单工厂
        CashContext cashContext = new CashContext(StrategyFactory.createCashSuper(type));
        */
        // 策略与简单工厂结合
        CashContext cashContext = new CashContext(type);
        System.out.println("原价： " + originalPrice);
        System.out.println("现价： " + cashContext.getResult(originalPrice));
    }
}
