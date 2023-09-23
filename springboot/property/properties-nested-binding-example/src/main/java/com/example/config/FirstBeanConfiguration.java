package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("firstbean")
public class FirstBeanConfiguration {

    private SecondBeanConfiguration secondbean;

    public SecondBeanConfiguration getSecondbean() {
        return secondbean;
    }

    public void setSecondbean(SecondBeanConfiguration secondbean) {
        this.secondbean = secondbean;
    }
}
