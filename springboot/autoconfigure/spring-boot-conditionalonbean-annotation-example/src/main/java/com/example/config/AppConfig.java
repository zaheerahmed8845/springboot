package com.example.config;

import com.example.service.EmailNotificationService;
import com.example.service.TwitterNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("emailNotification")
    @ConditionalOnBean(name = "emailNotificationProvider")
    public EmailNotificationService emailNotificationService() {
        return new EmailNotificationService();
    }

    @Bean("twitterNotification")
    public TwitterNotificationService twitterNotificationService() {
        return new TwitterNotificationService();
    }
}
