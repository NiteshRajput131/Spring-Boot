package com.advance.computePower.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.advance.computePower")
public class ComputePowerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ComputePowerApplication.class, args);
	}

}
