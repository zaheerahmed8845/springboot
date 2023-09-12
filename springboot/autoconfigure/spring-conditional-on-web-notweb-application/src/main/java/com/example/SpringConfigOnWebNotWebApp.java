package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnWebApplication
@ConditionalOnNotWebApplication
class SpringConfigOnWebNotWebApp {

	@Bean
	public Module module() {
		return new Module();
	}

}
