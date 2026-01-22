package com.interview.interview1.NotificationSystem;

public class main {
    public static void main(String[] args){
        NotificationService notificationService = new NotificationService();
        notificationService.addChannel(NotificationChannel.EMAIL,new EmailChannel());
        User user = new User("Rishav","rishavRaj");
        Notification notification = new Notification("Hi everyone",user);
        notificationService.sendNotification(notification,NotificationChannel.EMAIL);
    }
}
