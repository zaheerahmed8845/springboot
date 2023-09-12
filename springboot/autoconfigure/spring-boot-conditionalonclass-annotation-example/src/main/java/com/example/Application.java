package com.example;


import com.example.service.EmailNotificationService;
import com.example.service.SMSNotificationService;
import com.example.service.TwitterNotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(Application.class, args);

        SMSNotificationService smsNotificationService =
                context.getBean(SMSNotificationService.class);
        smsNotificationService.sendSmsNotification();

        EmailNotificationService emailNotificationService =
                context.getBean(EmailNotificationService.class);
        emailNotificationService.sendEmailNotification();

        TwitterNotificationService twitterNotificationService =
                context.getBean(TwitterNotificationService.class);
        twitterNotificationService.sendTwitterNotification();

        context.close();
    }
}
