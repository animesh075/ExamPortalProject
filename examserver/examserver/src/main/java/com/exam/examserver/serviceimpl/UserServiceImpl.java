package com.exam.examserver.serviceimpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examserver.exception.UserNotFoundException;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.repo.RoleRepository;
import com.exam.examserver.repo.UserRepository;
import com.exam.examserver.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	// creating user
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws UserNotFoundException{
		// TODO Auto-generated method stub
		User local=this.userRepository.findByUsername(user.getUsername());
		if(local!=null) {
			System.out.println("User is already there!!!");
			throw new UserNotFoundException("User already present!!!");
			
		}else {
			// user create
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			this.userRepository.save(user);
		}
		return local;
	}

	// getting user by username
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
	}

}
