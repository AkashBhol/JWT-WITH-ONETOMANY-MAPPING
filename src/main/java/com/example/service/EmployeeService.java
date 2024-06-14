package com.example.service;

import java.util.List;

import com.example.domain.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
}
