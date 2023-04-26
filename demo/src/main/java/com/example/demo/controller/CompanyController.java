package com.example.demo.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/student")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@PostMapping("/addCompany")
	public String add (@RequestBody Company company){
		companyService.saveCompany(company);
		return "New Company is added";
	}
	
	@GetMapping("/getAllCompanies")
	public List<Company> getAllCompanies(){
		return companyService.getAllCompanies();
	}
	
	

}
