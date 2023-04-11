package com.geek.design.patterns.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        ResourcePoolConfigV3 resourcePoolConfigV3 = new ResourcePoolConfigV3.Builder()
                .setName("dbConnectionTool")
                .setMaxIdle(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
        System.out.print("创建完成......" + resourcePoolConfigV3);
    }
}
