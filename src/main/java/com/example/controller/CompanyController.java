package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.CompanyDo;
import com.example.service.ComapnyService;

@RestController
@RequestMapping("/api")
public class CompanyController {

	@Autowired
	private ComapnyService comapnyService;
	
	@PostMapping("/comapny")
	public CompanyDo createCompany(@RequestBody CompanyDo companyDo) {
		CompanyDo createComapny = this.comapnyService.createComapny(companyDo);
		return createComapny;
	}
	
	@GetMapping("/AllComany")
	public List<CompanyDo> getAllCompany(){
		List<CompanyDo> allComapny = this.comapnyService.getAllComapny();
		return allComapny;
	}
}
