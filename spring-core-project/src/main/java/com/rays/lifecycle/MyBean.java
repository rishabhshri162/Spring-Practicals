package com.rays.lifecycle;

public class MyBean {
	
	public void init() {
		System.out.println("bean is created....");
	}
	
	public void destroy() {
		System.out.println("container close MyBean bean cleaned..");
	}


}
