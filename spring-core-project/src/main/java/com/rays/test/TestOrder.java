package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestOrder {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("user.xml"));

		Order o = (Order) factory.getBean("order");

		System.out.println(o.getProduct());
		System.out.println(o.getPrice());
		System.out.println(o.getQuantity());

		System.out.println("----------------");

		 o = (Order) factory.getBean("order1");

		System.out.println(o.getProduct());
		System.out.println(o.getPrice());
		System.out.println(o.getQuantity());

	}

}
