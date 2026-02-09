package com.rays.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rays.AppConfig;

public class TestHumanService {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HumanService service = context.getBean("humanService", HumanService.class);
		
		service.display();
		
	}

}
