package com.geek.design.patterns.singleton;

import java.util.concurrent.atomic.AtomicLong;

public enum EnumSingleton {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
