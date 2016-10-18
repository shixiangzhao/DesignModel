package com.cienet.facade.impl;

/**
 * 股票不如基金之外观模式的设计： 
 * 外观模式，为子系统中的一组借口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 首先，在设计初期阶段，应该有意识的将不同的两个层分离，比如MVC模式，层与层之间建立外观Facade。
 * 其次，在开发阶段，子系统往往因为不断的重构演化而变得越来越复杂，如其他模式使用时产生的小类，增加外观模式可以提供一个简单的接口，减少它们之间的依赖。
 * 第三，在维护一个大型系统时，可能这个系统已经非常难以维护和扩展，但新需求开发又依赖于它，
 * 这时可以为新系统开发一个外观类，来提供设计粗糙或高度复杂的遗留代码的比较清晰的简单接口，
 * 让新系统与Facade对象交互，Facade与遗留代码交互所有复杂的工作。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }
}
