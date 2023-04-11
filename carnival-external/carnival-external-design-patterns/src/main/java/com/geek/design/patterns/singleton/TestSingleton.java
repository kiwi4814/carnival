package com.geek.design.patterns.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestSingleton {

    public static void main(String[] args) {
        // 初始化饿汉式单例
        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
        log.info(eagerInitializedSingleton.toString());
        // 初始化懒汉式单例
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        log.info(lazyInitializedSingleton.toString());

    }
}
