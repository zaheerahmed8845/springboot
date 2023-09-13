package com.example.config;

import com.example.service.EmailNotificationService;
import com.example.service.TwitterNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnResource(resources = {"notification.properties"})
public class AppConfig {


    @Bean("emailNotification")
    public EmailNotificationService emailNotificationService() {
        return new EmailNotificationService();
    }

    @ConditionalOnResource(resources = {"message.properties"})
    @Bean("twitterNotification")
    public TwitterNotificationService twitterNotificationService() {
        return new TwitterNotificationService();
    }
}
