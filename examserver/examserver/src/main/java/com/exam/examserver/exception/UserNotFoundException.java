package com.exam.examserver.exception;

public class UserNotFoundException extends Exception {

	public UserNotFoundException() {
		super("User with this username is already there in DB!! Try with another username");
		// TODO Auto-generated constructor stub
	}

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
