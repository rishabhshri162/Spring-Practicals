package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserService;

@Component("testUserService")
public class TestUserService {

	@Autowired
	public UserService service = null;

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestUserService test = (TestUserService) context.getBean("testUserService");

//		test.testAdd();

//		test.testDelete();
		
		test.testUpdate();

	}

	public void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("Ram");
		dto.setLastName("Shrivastva");
		dto.setLogin("rs@gmail.com");
		dto.setPassword("Pass@123");
		long pk = service.add(dto);
		System.out.println("Data Inserted... pk = " + pk);
	}

	private void testDelete() {
		service.delete(2);
	}

	private void testUpdate() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("Ram");
		dto.setLastName("Shrivastava");
		dto.setLogin("ram@gmail.com");
		dto.setPassword("ram123");
		service.update(dto);
	}

}