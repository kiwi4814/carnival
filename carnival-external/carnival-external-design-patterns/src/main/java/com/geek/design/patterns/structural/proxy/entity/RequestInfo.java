package com.geek.design.patterns.structural.proxy.entity;

import lombok.Data;

@Data
public class RequestInfo {
    private String apiName;
    private double responseTime;
    private long timestamp;

    public RequestInfo(String apiName, double responseTime, long timestamp) {
        this.apiName = apiName;
        this.responseTime = responseTime;
        this.timestamp = timestamp;
    }
    //...省略constructor/getter/setter方法...
}