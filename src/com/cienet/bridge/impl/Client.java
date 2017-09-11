package com.cienet.bridge.impl;

/**
 * 组合/聚合复用原则（CARP），尽量使用组合/聚合，不要使用类继承。
 * 桥接模式，将抽象部分与它的实现部分分离，使它们都可以独立的变化。
 * 以手机软件和品牌为例，既可以按软件分类，又可以按品牌分类。如果只用继承就会增加大量的类，类数量是品牌和软件的组合数。
 * 实现系统可能有多个角度的分类，每一种分类都可能有变化，那么就把这种多角度分离出来让它们独立的变化，减少它们之间的耦合。
 * @author shixiang.zhao
 *
 */
public class Client {

    public static void main(String[] args) {
        HandsetBrand hbm = new HandsetBrandM();
        hbm.setHandsetSoft(new HandsetSoftGame());
        hbm.run();
        hbm.setHandsetSoft(new HandsetSoftAddressList());
        hbm.run();

        HandsetBrand hbn = new HandsetBrandN();
        hbn.setHandsetSoft(new HandsetSoftGame());
        hbn.run();
        hbn.setHandsetSoft(new HandsetSoftAddressList());
        hbn.run();
    }
}
