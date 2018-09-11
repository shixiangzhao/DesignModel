package com.cienet.adapter.impl;
/**
 * 在NBA我需要翻译之适配器模式的设计：
 * 适配器模式，将一个类的接口转换成客户希望的另外一个接口。
 * Adapter 使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * 系统数据和行为都正确，但接口不符时，我们应该考虑用适配器，目的是使控制范围之外的一个原有对象与某个接口匹配。
 * 主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致的情况。就像扁鹊能医治大病而出名。
 * @author shixiang.zhao
 */
public class Client {

    public static void main(String[] args) {
        Player bPlayer = new Forwards("巴蒂尔");
        bPlayer.attack();
        Player mPlayer = new Guards("迈克尔");
        mPlayer.attack();
        Player kPlayer = new Center("科比");
        kPlayer.attack();
        kPlayer.defense();

        ForeignCenter foreignCenter = new ForeignCenter();
        foreignCenter.setName("姚明");
        foreignCenter.jingong();
        foreignCenter.fangshou();

        System.out.println("----------------------");
        Player ymPlayer = new Translator("姚明");
        ymPlayer.attack();
        ymPlayer.defense();
    }
}
