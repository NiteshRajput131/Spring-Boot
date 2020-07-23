package com.advance.computeDays.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.advance.computeDays")
public class ComputeDaysApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ComputeDaysApplication.class, args);
	}


}
