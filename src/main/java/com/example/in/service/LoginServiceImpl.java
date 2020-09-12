package com.example.in.service;


@FunctionalInterface
public interface LoginServiceImpl {
	
public String login();

public default boolean validateUser(String username,String password) {
	
	if(username.equals("sunny") && password.equals("sunny@123")) {
		return true;
	}
	return false;
}
	
}
