package com.geek.principle.solid.ocp.model;

import java.util.HashMap;
import java.util.Map;

public class AlertRule {

    private Map<String, ApiRule> apiRuleMap = new HashMap<>();

    public ApiRule getMatchedRule(String api) {
        return apiRuleMap.get(api);
    }

    public class ApiRule {

        private long maxTps;
        private long maxErrorCount;
        private long maxTimeoutTps;

        public ApiRule(long maxTps, long maxErrorCount, long maxTimeoutTps) {
            this.maxTps = maxTps;
            this.maxErrorCount = maxErrorCount;
            this.maxTimeoutTps = maxTimeoutTps;
        }

        public long getMaxTps() {
            return maxTps;
        }

        public long getMaxErrorCount() {
            return maxErrorCount;
        }

        public long getMaxTimeoutTps() {
            return maxTimeoutTps;
        }
    }
}