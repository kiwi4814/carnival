package com.geek.principle.solid.ocp.handler;

import com.geek.principle.solid.ocp.model.AlertRule;
import com.geek.principle.solid.ocp.model.ApiStatInfo;
import com.geek.principle.solid.ocp.model.Notification;

public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
