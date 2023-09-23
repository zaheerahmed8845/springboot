package com.example;

import com.example.config.SfConstructorConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(SfConstructorConfiguration.class)
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        SfConstructorConfiguration sfConstructorConfiguration = context.getBean(SfConstructorConfiguration.class);
        System.out.println(sfConstructorConfiguration.getUsername());
        System.out.println(sfConstructorConfiguration.getPassword());
        System.out.println(sfConstructorConfiguration.getJdbcUrl());

    }
}
