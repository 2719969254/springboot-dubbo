package com.jd.springboot.controller;

import com.jd.springboot.api.CompanyService;
import com.jd.springboot.entity.CompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/company")
	public CompanyEntity findOne(){
		return companyService.findOneCompany();
	}
	
}
