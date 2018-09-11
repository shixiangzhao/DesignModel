package com.cienet.state.impl;

/**
 * 无尽加班何时休之状态模式模式
 * 状态模式，当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了其类。
 * 主要解决的是当控制一个对象状态转换的条件表达式过于复杂的情况。
 * 把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化。
 * 优点是，将与特定状态的相关行为局部化，并且将不同状态的行为分割开来。
 * 当一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变他的行为时，就可以考虑使用状态模式了。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(10);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(13);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(14);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(17);

        emergencyProjects.setFinish(false);

        emergencyProjects.writeProgram();
        emergencyProjects.setHour(19);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(22);
        emergencyProjects.writeProgram();

    }

}
