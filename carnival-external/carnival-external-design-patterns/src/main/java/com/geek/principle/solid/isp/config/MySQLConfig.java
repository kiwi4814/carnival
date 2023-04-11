package com.geek.principle.solid.isp.config;


import com.geek.principle.solid.isp.config.inter.Updater;
import com.geek.principle.solid.isp.config.inter.Viewer;

import java.util.Map;

public class MySQLConfig implements Viewer {
    private ConfigSource configSource; //配置中心（比如zookeeper）

    public MySQLConfig(ConfigSource configSource) {
        this.configSource = configSource;
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
