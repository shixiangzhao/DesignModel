package com.cienet.interpreter.impl;

/**
 * class: Expression <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/13 11:17
 */
public abstract class Expression {

    /**
     * 解释器
     *
     * @method: interpret <br>
     * @version 1.0.0 <br>
     * @author: ZhaoShixiang <br>
     * @date: 2018/9/15 11:11
     * @param context
     * @return void
     */
    public void interpret(PlayContext context) {
        if (context.getText().length() == 0) {
            return;
        } else {
            // 一个字母，一个数字
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playValue = Double.valueOf(context.getText().
                    substring(0, context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));

            execute(playKey, playValue);
        }
    }

    /**
     * 执行
     *
     * @method: execute <br>
     * @version 1.0.0 <br>
     * @author: ZhaoShixiang <br>
     * @date: 2018/9/15 10:11
     * @param key
     * @param value
     * @return void
     */
    public abstract void  execute(String key, double value);

}