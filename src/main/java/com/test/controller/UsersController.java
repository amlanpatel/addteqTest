package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.domain.User;
import com.test.service.UserService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET, path = "/home")
	public String welcome() {
		return "Welcome";
	}
	@RequestMapping(method = RequestMethod.GET, path = "/get" )
	public List<User> fetchUsers() {
		return service.fetchUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/save")
	public void saveUser(@RequestBody User user ) {
		service.saveUser(user);
	}
}
