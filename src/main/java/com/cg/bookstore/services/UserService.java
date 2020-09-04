package com.cg.bookstore.services;

import java.util.List;

import com.cg.bookstore.models.User;


public interface UserService {
	
	public List<User> getUsers();
	
	public User findByEmail(String email);
	
	public User saveUser(User user);
	
	public User updateUser(User user);

}
