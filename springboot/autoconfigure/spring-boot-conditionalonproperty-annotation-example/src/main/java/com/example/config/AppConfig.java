package com.example.config;

import com.example.service.EmailNotificationService;
import com.example.service.NotificationService;
import com.example.service.TwitterNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @ConditionalOnProperty
            (prefix = "notification",
                    name = "service")
    @Bean(name = "emailNotification")
    public NotificationService emailNotificationService() {
        return new EmailNotificationService();
    }

    @ConditionalOnProperty
            (prefix = "notification",
                    name = "service",
                    havingValue = "twitter")
    @Bean(name = "twitterNotification")
    public NotificationService twitterNotificationService() {
        return new TwitterNotificationService();
    }

}
