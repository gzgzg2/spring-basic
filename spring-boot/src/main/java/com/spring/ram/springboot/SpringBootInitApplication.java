package com.spring.ram.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootInitApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ApplicationContext.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
//		SpringApplication.run(SpringBootInitApplication.class, args);
	}
}
