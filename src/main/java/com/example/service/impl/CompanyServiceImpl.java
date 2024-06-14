package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.CompanyDo;
import com.example.repository.CompanyRepo;
import com.example.repository.EmployeeRepo;
import com.example.service.ComapnyService;

@Service
public class CompanyServiceImpl implements ComapnyService{

	@Autowired
	private CompanyRepo companyRepo;
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public CompanyDo createComapny(CompanyDo companyDo) {
		CompanyDo save = this.companyRepo.save(companyDo);
		return save;
	}

	@Override
	public List<CompanyDo> getAllComapny() {
		List<CompanyDo> findAll = this.companyRepo.findAll();
		return findAll;
	}
	
	

}
