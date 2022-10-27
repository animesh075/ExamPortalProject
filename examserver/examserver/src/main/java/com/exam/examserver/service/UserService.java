package com.exam.examserver.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.exam.examserver.exception.UserNotFoundException;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;

@Service
public interface UserService {

	// creating user
	public User createUser(User user, Set<UserRole> userRoles) throws UserNotFoundException;
	
	// get user by username
	public User getUser(String username);
	
	// delete user by user id
	public void deleteUser(Long userId);
}
