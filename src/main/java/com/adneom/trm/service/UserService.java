package com.adneom.trm.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.adneom.trm.repository.UserRepositoryy;

@Service
public class UserService {
	
	@Inject
	private UserRepositoryy userRepository;	
	

	public boolean getAuthenticate(String name, String pass) {
		return userRepository.Authenticate(name, pass);
	}

}
