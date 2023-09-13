package com.example.config;


import com.example.provider.NotificationProvider;
import com.example.service.EmailNotificationService;
import com.example.service.SMSNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnClass(name = "com.example.provider.NotificationProvider")
    public SMSNotificationService smsNotificationService() {
        return new SMSNotificationService();
    }

    @Bean
    @ConditionalOnClass(NotificationProvider.class)
    public EmailNotificationService emailNotificationService() {
        return new EmailNotificationService();
    }
}
