package com.interview.interview1.NotificationSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class NotificationService {
    HashMap<NotificationChannel , NotificationInterface> map = new HashMap<>();

    public void addChannel(NotificationChannel notificationChannel,NotificationInterface notificationInterface){
        map.put(notificationChannel,notificationInterface);
    }

    public void removeChannel(NotificationChannel notificationChannel){
        map.remove(notificationChannel);
    }

    public void sendNotification(Notification notification,NotificationChannel notificationChannel){
        NotificationInterface notificationInterface = map.get(notificationChannel);
        notificationInterface.sendNotification(notification);
    }

    public void sendNotificationToAll(Notification notification) {
    for (Map.Entry<NotificationChannel, NotificationInterface> entry : map.entrySet()) {
        NotificationChannel channel = entry.getKey();
        NotificationInterface notificationInterface = entry.getValue();

        notificationInterface.sendNotification(notification);
    }

}

