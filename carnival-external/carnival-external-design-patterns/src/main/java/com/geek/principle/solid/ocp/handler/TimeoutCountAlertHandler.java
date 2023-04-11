package com.geek.principle.solid.ocp.handler;

import com.geek.principle.solid.ocp.constant.NotificationEmergencyLevel;
import com.geek.principle.solid.ocp.model.AlertRule;
import com.geek.principle.solid.ocp.model.ApiStatInfo;
import com.geek.principle.solid.ocp.model.Notification;
// 改动二：添加新的handler
public class TimeoutCountAlertHandler extends AlertHandler {

    public TimeoutCountAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {

        if (apiStatInfo.getTimeoutCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
