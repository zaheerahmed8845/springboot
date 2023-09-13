package com.example.config;


import com.example.service.EmailNotificationService;
import com.example.service.NotificationService;
import com.example.service.SMSNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public NotificationService smsNotificationService() {
        return new SMSNotificationService();
    }

    @Bean
    @ConditionalOnMissingBean
    public NotificationService emailNotificationService() {
        return new EmailNotificationService();
    }

}
