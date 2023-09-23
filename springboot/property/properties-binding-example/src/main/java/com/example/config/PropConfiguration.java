package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
//@Configuration
@Component
public class PropConfiguration {

    private String prop1;
    private String prop2;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }
}
