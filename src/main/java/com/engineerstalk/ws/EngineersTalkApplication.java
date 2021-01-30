package com.engineerstalk.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
//@ComponentScan(basePackageClasses = UserController.class)
@ComponentScan(basePackages = "com.engineerstalk.ws")

public class EngineersTalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(EngineersTalkApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SpringApplicationContext springApplicationContext() {
		return new SpringApplicationContext();
		
	}
}
