package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot01Application {

	public static void main(String[] args) {
	Object obj = 	SpringApplication.run(SpringBoot01Application.class, args);
		
		System.out.println(obj.toString().getClass());
		System.out.println("Hello Meri Jaan...");
	}

}
