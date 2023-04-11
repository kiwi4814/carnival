package com.geek.design.patterns.creational.prototype.entity;

import lombok.Data;

@Data
public class SearchWord {

    private String keyword;
    private long lastUpdateTime;
    private long count;

}
