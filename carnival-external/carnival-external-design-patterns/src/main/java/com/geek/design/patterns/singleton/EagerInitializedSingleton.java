package com.geek.design.patterns.singleton;


public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // 将构造器初始化防止客户端new实例
    // private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {

    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

}