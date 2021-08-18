package com.kidsbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.kidsbuddy.*")
public class SpringMysqlCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlCrudApplication.class, args);
	}

}
