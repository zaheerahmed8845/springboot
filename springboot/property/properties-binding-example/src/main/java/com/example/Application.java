package com.example;

import com.example.config.PropConfiguration;
import com.example.config.SfConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        SfConfiguration sfConfiguration = context.getBean(SfConfiguration.class);
        System.out.println(sfConfiguration.getUsername());
        System.out.println(sfConfiguration.getPassword());
        System.out.println(sfConfiguration.getJdbcUrl());

        PropConfiguration propConfiguration = context.getBean(PropConfiguration.class);
        System.out.println(propConfiguration.getProp1());
        System.out.println(propConfiguration.getProp2());
    }
}