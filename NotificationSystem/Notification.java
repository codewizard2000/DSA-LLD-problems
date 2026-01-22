package com.interview.interview1.NotificationSystem;

public class Notification {
    String message;
    User user;

    public Notification(String message,User user){
        this.message=message;
        this.user=user;
    }

    public String getMessage(){
        return message;
    }

    public User getUser(){
        return user;
    }
}
