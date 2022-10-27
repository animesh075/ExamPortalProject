package com.exam.examserver.exception;

public class UserFoundException extends Exception {
	public UserFoundException() {
		super("User with this username not found there in DB!!!");
		// TODO Auto-generated constructor stub
	}

	public UserFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
