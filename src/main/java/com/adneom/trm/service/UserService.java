package com.adneom.trm.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.adneom.trm.repository.UserRepository;

@Service
public class UserService {
	
	@Inject
	private UserRepository userRepository;	
	

	public boolean getAuthenticate(String name, String pass) {
		return userRepository.Authenticate2(name, pass);
	}

}
