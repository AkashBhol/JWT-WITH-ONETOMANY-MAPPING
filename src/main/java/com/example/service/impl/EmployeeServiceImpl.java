package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepo;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee createEmployee(Employee employee) {
		Employee save = this.employeeRepo.save(employee);
		return save;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> findAll = this.employeeRepo.findAll();
		return findAll;
	}

}
