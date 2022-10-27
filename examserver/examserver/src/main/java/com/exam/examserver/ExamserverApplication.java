package com.exam.examserver;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting Code");
		
//		User user = new User();
//		
//		user.setFirstName("Animesh");
//		user.setLastName("Sahoo");
//		user.setUsername("animesh1998");
//		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
//		user.setEmail("animesh@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//		
//		HashSet<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		
//		userRole.setRole(role1);
//		
//		userRole.setUser(user);
//		
//		userRoleSet.add(new UserRole());
//		
//		User user1=userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
		
	}

}
