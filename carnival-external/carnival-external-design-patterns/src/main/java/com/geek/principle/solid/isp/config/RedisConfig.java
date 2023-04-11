package com.geek.principle.solid.isp.config;


import com.geek.principle.solid.isp.config.inter.Updater;
import com.geek.principle.solid.isp.config.inter.Viewer;

import java.util.Map;

public class RedisConfig implements Updater , Viewer {
    private ConfigSource configSource; //配置中心（比如zookeeper）
    private String address;
    private int timeout;
    private int maxTotal;
    //省略其他配置: maxWaitMillis,maxIdle,minIdle...

    public RedisConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    public String getAddress() {
        return this.address;
    }
    //...省略其他get()、init()方法...

    @Override
    public void update() {
        //从configSource加载配置到address/timeout/maxTotal...
    }

    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map<String, String> output() {
        return null;
    }
}
