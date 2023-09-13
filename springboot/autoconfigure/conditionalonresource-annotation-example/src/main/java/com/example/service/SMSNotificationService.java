package com.example.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.stereotype.Service;

@Service("smsNotification")
@ConditionalOnResource(resources = {"notification.properties"})
public class SMSNotificationService {

    public SMSNotificationService() {

        System.out.println("UserService Constructor");
    }
}
