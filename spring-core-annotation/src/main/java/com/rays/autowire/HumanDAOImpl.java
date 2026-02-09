package com.rays.autowire;

import org.springframework.stereotype.Repository;

@Repository("humanDao")
public class HumanDAOImpl implements HumanDAOInt{

	public void display() {

		System.out.println("Hii this is my method");	
			
	}

}
