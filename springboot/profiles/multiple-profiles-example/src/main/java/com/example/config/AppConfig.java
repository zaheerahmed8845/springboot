package com.example.config;

import com.example.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    FakeDataSource getFakeDataSource(@Value("${example.username}") String username,
                                     @Value("${example.password}") String password,
                                     @Value("${example.jdbcurl}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcUrl(jdbcurl);
        return fakeDataSource;
    }
}
