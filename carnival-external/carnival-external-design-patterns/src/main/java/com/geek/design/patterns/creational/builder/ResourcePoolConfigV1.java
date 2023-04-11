package com.geek.design.patterns.creational.builder;


import cn.hutool.core.text.CharSequenceUtil;
import lombok.Data;

/**
 * 构造函数
 */
@Data
public class ResourcePoolConfigV1 {
    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

    private String name;
    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_IDLE;

    public ResourcePoolConfigV1(String name, Integer maxTotal, Integer maxIdle, Integer minIdle) {
        if (CharSequenceUtil.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty.");
        }
        this.name = name;

        if (maxTotal != null) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("maxTotal should be positive.");
            }
            this.maxTotal = maxTotal;
        }

        if (maxIdle != null) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("maxIdle should not be negative.");
            }
            this.maxIdle = maxIdle;
        }

        if (minIdle != null) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("minIdle should not be negative.");
            }
            this.minIdle = minIdle;
        }
    }
}
