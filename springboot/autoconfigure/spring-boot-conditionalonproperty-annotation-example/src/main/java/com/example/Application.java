package com.example;


import com.example.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    NotificationService emailNotification;

    @Autowired
    NotificationService twitterNotification;

    @Autowired
    NotificationService smsNotification;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(emailNotification.
                sendNotification("Email message"));
        System.out.println(twitterNotification.
                sendNotification("Twitter message"));
        System.out.println(smsNotification.
                sendNotification("SMS message"));
    }
}