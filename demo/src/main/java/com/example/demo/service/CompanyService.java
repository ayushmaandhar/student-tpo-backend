package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Company;

public interface CompanyService {
	public Company saveCompany(Company company);
	public List<Company> getAllCompanies();

}
