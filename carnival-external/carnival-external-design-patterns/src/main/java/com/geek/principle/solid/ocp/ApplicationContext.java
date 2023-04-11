package com.geek.principle.solid.ocp;

import com.geek.principle.solid.ocp.handler.ErrorAlertHandler;
import com.geek.principle.solid.ocp.handler.TimeoutCountAlertHandler;
import com.geek.principle.solid.ocp.handler.TpsAlertHandler;
import com.geek.principle.solid.ocp.model.Alert;
import com.geek.principle.solid.ocp.model.AlertRule;
import com.geek.principle.solid.ocp.model.Notification;

public class ApplicationContext {
    private AlertRule alertRule;
    private Notification notification;
    private Alert alert;

    public void initializeBeans() {
        alertRule = new AlertRule(/*.省略参数.*/);
        notification = new Notification(/*.省略参数.*/);
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule, notification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule, notification));
        // 改动三：注册handler
        alert.addAlertHandler(new TimeoutCountAlertHandler(alertRule, notification));
    }

    public Alert getAlert() {
        return this.alert;
    }

    // 饿汉式单例
    private static final ApplicationContext instance = new ApplicationContext();

    private ApplicationContext() {
        initializeBeans();
    }

    public static ApplicationContext getInstance() {
        return instance;
    }

}
