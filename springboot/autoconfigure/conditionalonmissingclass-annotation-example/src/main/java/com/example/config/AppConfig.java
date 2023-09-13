package com.example.config;

import com.example.service.SMSNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnMissingClass(value = "com.example.provider.NotificationProvider")
    public SMSNotificationService smsNotificationService() {
        return new SMSNotificationService();
    }

}
