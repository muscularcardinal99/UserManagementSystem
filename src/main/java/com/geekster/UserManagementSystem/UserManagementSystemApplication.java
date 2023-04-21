package com.geekster.UserManagementSystem;

import com.geekster.UserManagementSystem.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementSystemApplication {
	User u = new User();


	public static void main(String[] args) {
		SpringApplication.run(UserManagementSystemApplication.class, args);
	}

}
