package com.codurance.dip;

public abstract class NotificationSender {

    public void send(Notification notification) {
        System.out.println("Notification sent to:"+notification.getTo());
    }
}
