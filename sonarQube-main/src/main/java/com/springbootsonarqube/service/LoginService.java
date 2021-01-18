package com.springbootsonarqube.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsonarqube.dao.User;
import com.springbootsonarqube.repository.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepo loginRepo;
	
	public User save(User user) {
		System.out.println(user);
		return loginRepo.save(user);
	}
	
	public List<User> getAll(){
		return loginRepo.findAll();
	}

}
