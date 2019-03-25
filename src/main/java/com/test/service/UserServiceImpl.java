package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserReposetory;
import com.test.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserReposetory repository;
	
	@Override
	public List<User> fetchUsers() {
		return repository.findAll();
	}

	@Override
	public void saveUser(User user) {
		repository.save(user);
	}

}
