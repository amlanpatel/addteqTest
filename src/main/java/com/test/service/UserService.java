package com.test.service;

import java.util.List;

import com.test.domain.User;

public interface UserService {

	public List<User> fetchUsers();

	public void saveUser(User user);
}
