package com.geek.principle.solid.isp.config;


import com.geek.principle.solid.isp.config.inter.Updater;

public class KafkaConfig implements Updater {
    private ConfigSource configSource; //配置中心（比如zookeeper）
    public KafkaConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    public void update() {
        //从configSource加载配置到address/timeout/maxTotal...
    }
}
