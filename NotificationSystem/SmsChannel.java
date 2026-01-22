package com.interview.interview1.NotificationSystem;

public class SmsChannel implements NotificationInterface{
    @Override
    public void sendNotification(Notification notification) {
        System.out.println(
                "SMS notification sent to " +
                        notification.getUser().getName() +
                        " by " + NotificationChannel.SMS +
                        " message: " + notification.getMessage()
        );
    }
}
