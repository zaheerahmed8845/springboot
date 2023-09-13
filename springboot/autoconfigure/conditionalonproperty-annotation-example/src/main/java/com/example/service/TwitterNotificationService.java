package com.example.service;

public class TwitterNotificationService implements NotificationService {
    @Override
    public String sendNotification(String message) {
        return "Twitter Notification: " + message;
    }
}
