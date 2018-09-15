package com.cienet.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * class: Client <br>
 * 解释器模式（Interpreter），给定一种语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该文法来解释这些句子来解决问题。
 * 应用场景：比如正则表达式，浏览器。
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/13 10:51
 */
public class Client {

    public static void main(String[] args) {
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        Context context = new Context();
        for (AbstractExpression ae : list) {
            ae.interpret(context);
        }
    }
}