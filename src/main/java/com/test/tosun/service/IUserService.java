package com.test.tosun.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.test.tosun.dto.UserRegistrationDto;
import com.test.tosun.model.User;

public interface IUserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	
}
