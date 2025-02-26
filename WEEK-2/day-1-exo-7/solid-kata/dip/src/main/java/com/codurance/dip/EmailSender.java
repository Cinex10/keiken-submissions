package com.codurance.dip;

public class EmailSender extends NotificationSender {

    @Override
    public void send(Notification notification) {
        System.out.print("To:"+notification.getTo()+", Subject: "+notification.getSubject()+", Message: "+notification.getMessage());
    }
}
