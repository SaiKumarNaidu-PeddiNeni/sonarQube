package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.applicationexception.ApplicationException;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/save")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);	
	}
	
	@GetMapping(value="/get/{id}")
	public Employee readEmployee(@PathVariable("id") int  id) throws ApplicationException
	{
		Employee employee= new Employee(); 
		try {
		employee = employeeService.getEmployeeById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return employee;
	}
	
	@GetMapping(value="/getAllEmplyees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public Employee  deleteEmployee(@PathVariable("id") int  id) throws ApplicationException
	{
		employeeService.deleteEmployee(id);
		return null;
	}
	
	@PutMapping(value = "/update")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);	
	}
	
}
