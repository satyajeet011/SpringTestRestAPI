package com.springrest.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringrestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

}
