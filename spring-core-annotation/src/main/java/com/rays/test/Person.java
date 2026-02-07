package com.rays.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")          //Person person = new Person
public class Person {
	
	private String name;
	
	private String address;
	
	@Value("Ram")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("Indore")
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	

}
