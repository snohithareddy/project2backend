package com.niit.dao;


import com.niit.model.User;

public interface UserDao {

	 void registerUser(User user);
	 boolean isEmailUnique(String email);
	 User login(User user);
	void update(User validUser);
	User getUser(String email);
		
	
	
}