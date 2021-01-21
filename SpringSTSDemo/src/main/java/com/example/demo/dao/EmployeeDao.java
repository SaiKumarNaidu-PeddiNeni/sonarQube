package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
