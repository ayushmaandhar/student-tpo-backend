package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

}
