package com.geek.design.patterns.structural.proxy.util;

import cn.hutool.core.text.CharSequenceUtil;
import com.geek.design.patterns.structural.proxy.entity.RequestInfo;
import com.geek.design.patterns.structural.proxy.MetricsStorage;

public class MetricsCollector {
    private MetricsStorage metricsStorage;//基于接口而非实现编程

    //依赖注入
    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    //用一个函数代替了最小原型中的两个函数
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || CharSequenceUtil.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}

