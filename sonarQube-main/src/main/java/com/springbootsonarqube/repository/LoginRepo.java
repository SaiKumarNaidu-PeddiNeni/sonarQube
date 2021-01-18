package com.springbootsonarqube.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootsonarqube.dao.User;

public interface LoginRepo extends JpaRepository<User, Long>{

}
