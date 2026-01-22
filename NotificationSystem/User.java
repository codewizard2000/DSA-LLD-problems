package com.interview.interview1.NotificationSystem;

public class User {
    String name;
    String emailId;

    public User(String name, String emailId){
        this.name = name;
        this.emailId =emailId;
    }

    public String getName(){
        return name;
    }

    public String getEmailId(){
        return emailId;
    }
}
