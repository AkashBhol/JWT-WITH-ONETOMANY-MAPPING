package com.example.service;

import java.util.List;

import com.example.domain.CompanyDo;

public interface ComapnyService {

	public CompanyDo createComapny(CompanyDo companyDo);
	
	public List<CompanyDo> getAllComapny();
}
