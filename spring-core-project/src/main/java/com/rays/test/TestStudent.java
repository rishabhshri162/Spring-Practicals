package com.rays.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		
		//by using application context
		 ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		 
		 Student dto = (Student)context.getBean("student");
		 
		 System.out.println(dto.getName());
		 System.out.println(dto.getRollNo());
		 System.out.println(dto.getPhy());
		 System.out.println(dto.getChm());
		 System.out.println(dto.getMath());
	}

}
