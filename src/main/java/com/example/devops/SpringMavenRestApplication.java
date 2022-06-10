package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringMavenRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMavenRestApplication.class, args);
		System.out.println("welcome to Springboot Application.....");
	}

}
