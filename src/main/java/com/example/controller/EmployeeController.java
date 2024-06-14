package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Employee;
import com.example.service.EmployeeService;

@RequestMapping("/api")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		Employee createEmployee = this.employeeService.createEmployee(employee);
		return createEmployee;
	}
	
	@GetMapping("/employee/get")
	public List<Employee> getAllEmployee(){
		List<Employee> allEmployee = this.employeeService.getAllEmployee();
		return allEmployee;
	}
}
