package com.engineerstalk.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.engineerstalk.ws.ui.controller.UserController;

@SpringBootApplication
@ComponentScan(basePackageClasses = UserController.class)

public class EngineersTalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(EngineersTalkApplication.class, args);
	}

}
