package com.springbootsonarqube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootsonarqube.dao.User;
import com.springbootsonarqube.service.LoginService;

@RestController
public class DemoController {

	@Autowired
	private LoginService loginService;
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String msg() {
		//TODO
		int a;
		return "hello";
	}
	
	@PutMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user){
		return new ResponseEntity<>(loginService.save(user),HttpStatus.OK);
	}
}
