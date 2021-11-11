package com.sparta.StarProjectLocationDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StarProjectLocationDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarProjectLocationDbApplication.class, args);
	}

}
