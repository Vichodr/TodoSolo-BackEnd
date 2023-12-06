package com.example.TodoSolo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.TodoSolo")
public class TodoSoloApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoSoloApplication.class, args);
		System.out.print("Base de datos conectada");
	}

}
