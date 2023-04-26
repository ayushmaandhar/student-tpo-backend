package com.example.demo.service;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
	@NonNull
	private String firstName; 
	
	@NonNull
	private String LastName;
	
	@NonNull
	private String email;
	
	@NonNull
	private String password;

}
