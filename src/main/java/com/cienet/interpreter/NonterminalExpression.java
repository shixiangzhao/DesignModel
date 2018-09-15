package com.cienet.interpreter;

/**
 * class: NonterminalExpression <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/13 10:43
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println(this.getClass().getName() + " to do interpret.");
    }
}