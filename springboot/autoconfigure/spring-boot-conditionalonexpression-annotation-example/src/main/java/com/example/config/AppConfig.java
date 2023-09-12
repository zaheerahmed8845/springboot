package com.example.config;

import com.example.service.EmailNotificationService;
import com.example.service.NotificationService;
import com.example.service.SMSNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnExpression("${notification.enabled:false} " +
            "&& ${notification.sms.enabled:false}")
    public NotificationService smsNotificationService() {
        return new SMSNotificationService();
    }

    @Bean
    @ConditionalOnExpression("${notification.enabled:false} " +
            "&& ${notification.email.enabled:false}")
    public NotificationService emailNotificationService() {
        return new EmailNotificationService();
    }

}
