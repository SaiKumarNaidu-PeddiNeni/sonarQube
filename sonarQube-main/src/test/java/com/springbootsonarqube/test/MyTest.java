package com.springbootsonarqube.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springbootsonarqube.dao.User;
import com.springbootsonarqube.service.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { AnotherTest.class})

public class MyTest {
	
	@Autowired
	private LoginService loginService;
	private User user;
	@Before
	public void init() {
		 user = new User();
	}

	@Test
	public void validateCreate() {
		user.setId(2);
		user.setUserName("kumar");
		user.setPassword("1234");
		//user = new User(1,"sunil","1234");
		loginService.save(user);
	}
	
	@Test
	public void validateSize() {
		assertEquals(2,loginService.getAll().size());
		//assertEquals();
		
	}
	@Test
	public void sampleTest2() {
		
	}
	
}
