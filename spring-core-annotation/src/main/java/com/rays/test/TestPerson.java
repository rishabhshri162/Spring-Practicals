package com.rays.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rays.AppConfig;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Person person = context.getBean("person", Person.class);

		System.out.println(person.getName());
		System.out.println(person.getAddress());
		
		System.out.println("-------------------------------------");

		Person person1 = context.getBean("person", Person.class);
		
		person1.setName("Rishabh");          //person class me @value ki jagah yaha set kr skte hai
		person1.setAddress("Delhi");

		System.out.println(person1.getName());
		System.out.println(person1.getAddress());

	}

}
