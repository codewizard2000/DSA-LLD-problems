package com.interview.interview1.NotificationSystem;

public class EmailChannel implements NotificationInterface{
    @Override
    public void sendNotification(Notification notification) {
        System.out.println(
                "Email notification sent to " +
                        notification.getUser().getName() +
                        " by " + NotificationChannel.EMAIL +
                        " message: " + notification.getMessage()
        );
    }

}
