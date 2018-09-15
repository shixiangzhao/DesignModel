package com.cienet.interpreter.impl;

import com.sun.deploy.util.StringUtils;

/**
 * class: Client <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/15 10:21
 */
public class Client {

    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        System.out.println("上海滩：");
        context.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 D 3 E 0.5 D 3 E " +
                "0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        try {
            while (context.getText().length() > 0) {
                String str = context.getText().substring(0, 1);
                switch (str){
                    case  "O":
                        // 当首字母是O时，则表达式实例化为音阶
                        expression = new Scale(); break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        // 当首字母是CDEFGAB，以及休止符P时，则实例化音符
                        expression = new Note(); break;
                }
                expression.interpret(context);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}