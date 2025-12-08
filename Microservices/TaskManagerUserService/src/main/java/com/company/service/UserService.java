package com.company.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.UserEntity;
import com.company.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public String register(UserEntity user) {
		if(repo.existsByUsername(user.getUsername()))
		return "USername already exists";
	
	repo.save(user);
	return "user Saved succssfully";
	}
}

	
