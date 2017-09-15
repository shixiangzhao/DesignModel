package com.cienet.singleton;

public class Client {

    public static void main(String[] args) {
        // 懒汉式无法支持多线程
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton.getInstance())).start();
        }
    }
}
