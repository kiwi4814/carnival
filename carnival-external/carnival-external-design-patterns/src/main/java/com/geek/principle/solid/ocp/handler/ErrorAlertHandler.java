package com.geek.principle.solid.ocp.handler;

import com.geek.principle.solid.ocp.constant.NotificationEmergencyLevel;
import com.geek.principle.solid.ocp.model.AlertRule;
import com.geek.principle.solid.ocp.model.ApiStatInfo;
import com.geek.principle.solid.ocp.model.Notification;

public class ErrorAlertHandler extends AlertHandler {

    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
