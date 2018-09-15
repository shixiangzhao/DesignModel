package com.cienet.interpreter.impl;

/**
 * class: Scale <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 10:15
 */
public class Scale extends Expression {

    @Override
    public void execute(String key, double value) {
        String scale = "";
        String val = Math.round(value) + "";
        switch (Integer.valueOf(val)) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
        }
        System.out.print(scale + " ");
    }
}