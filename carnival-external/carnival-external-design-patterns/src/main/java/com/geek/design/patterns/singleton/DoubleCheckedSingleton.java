package com.geek.design.patterns.singleton;

public class DoubleCheckedSingleton {

    private static volatile DoubleCheckedSingleton instance;
    private static Object mutex = new Object();

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        DoubleCheckedSingleton tempInstance = instance;
        if (null == tempInstance) {
            synchronized (DoubleCheckedSingleton.mutex) { // 这里加锁的为什么是mutex而不是DoubleCheckedSingleton.class？
                tempInstance = instance; // 这里为什么要第二次赋值？
                if (null == tempInstance) {
                    instance = tempInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return tempInstance; // return出去的是临时变量
    }

}