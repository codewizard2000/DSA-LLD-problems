package com.interview.interview1.NotificationSystem;

public class PushChannel implements NotificationInterface{
    @Override
    public void sendNotification(Notification notification) {
        System.out.println(
                "Push notification sent to " +
                        notification.getUser().getName() +
                        " by " + NotificationChannel.PUSH +
                        " message: " + notification.getMessage()
        );
    }
}
