package com.geek.principle.solid.isp;

import java.util.concurrent.atomic.AtomicInteger;

public class ClassPractice {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        // 给整数增加一，并且返回未増之前的值。这个接口符合接口隔离原则么？
        int andIncrement = atomicInteger.getAndIncrement();
        // 答案，


    }
}
