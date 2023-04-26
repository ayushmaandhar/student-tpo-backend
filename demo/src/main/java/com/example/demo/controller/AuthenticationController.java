package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.security.config.JwtUtils;
import com.example.demo.web.dao.UserDao;
import com.example.demo.web.dto.AuthenticationRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {
	
	private final AuthenticationManager authenticationManager = null;
	private final UserDao userDao = new UserDao();
	private final JwtUtils jwtUtils = new JwtUtils();
	
	@PostMapping("/authenticate")
	public ResponseEntity<String> authenticate( @RequestBody AuthenticationRequest request) {
		 authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
				);
		 final UserDetails user = userDao.findUserByEmail(request.getEmail());
		 if(user != null) {
			 return ResponseEntity.ok(jwtUtils.generateToken(user));
		 }
		 return ResponseEntity.status(400).body("Some error has occured!");
		
	}

}
