package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.applicationexception.ApplicationException;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao; // Dependency Injection.

	public Employee saveEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	public Employee getEmployeeById(int empId) throws ApplicationException {
		Optional<Employee> optional = employeeDao.findById(empId);
		if (optional.isPresent())
			return optional.get();
		else
			throw new ApplicationException("Record Not Found - No Such Employee");
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = (List<Employee>) employeeDao.findAll();
		return employeeList;
	}

	public void deleteEmployee(int id) throws ApplicationException {
		try {
			employeeDao.deleteById(id);
		} catch (Exception e) {
			throw new ApplicationException("Record Not Found - No Such Employee");
		}
	}

	
}
