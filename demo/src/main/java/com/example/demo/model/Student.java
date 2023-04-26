package com.example.demo.model;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long mobile;
	private String college;
	private String branch;
	private String year;
	private String batch;
	private int perc_10th; //(0-100)
	private int perc_12th; //(0-100)
	private int ClgAgg; //(0-10)
	private int lastSem; //(1-8)
	private List<String> OfferedAt;
	private String password;
	
	
	public Student() {}

	public int getId() {
		return id; 
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public int getPerc_10th() {
		return perc_10th;
	}

	public void setPerc_10th(int perc_10th) {
		this.perc_10th = perc_10th;
	}

	public int getPerc_12th() {
		return perc_12th;
	}

	public void setPerc_12th(int perc_12th) {
		this.perc_12th = perc_12th;
	}

	public int getClgAgg() {
		return ClgAgg;
	}

	public void setClgAgg(int clgAgg) {
		ClgAgg = clgAgg;
	}

	public int getLastSem() {
		return lastSem;
	}

	public void setLastSem(int lastSem) {
		this.lastSem = lastSem;
	}

	public List<String> getOfferedAt() {
		return OfferedAt;
	}

	public void setOfferedAt(List<String> offeredAt) {
		OfferedAt = offeredAt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	
	
	
}