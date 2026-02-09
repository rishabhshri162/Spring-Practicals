package com.rays.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("humanService")
public class HumanService {
	
	@Autowired
	private HumanDAOInt humanDao;


	public void display() {
		humanDao.display();		
	}

}
