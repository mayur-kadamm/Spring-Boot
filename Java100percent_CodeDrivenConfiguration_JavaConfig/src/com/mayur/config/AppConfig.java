package com.mayur.config;
import java.time.LocalDate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // make it as a configuration class
@ComponentScan(basePackages = "com.mayur.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig:: 0 param constructor");
	}
	
	// pre-define class as a spring bean
	public LocalDate createDate(	) {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}
}
