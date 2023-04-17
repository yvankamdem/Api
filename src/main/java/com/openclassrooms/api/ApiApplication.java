package com.openclassrooms.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ApiApplication.class, args);
    }

}
