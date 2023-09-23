package com.example;

import com.example.config.FirstBeanConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        FirstBeanConfiguration firstBeanConfiguration = context.getBean(FirstBeanConfiguration.class);
        System.out.println(firstBeanConfiguration.getSecondbean().getValue());
        System.out.println(firstBeanConfiguration.getSecondbean().getThirdBean().getValue());
    }
}