package com.te.refreshtoken;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.te.refreshtoken.entity.Role;
import com.te.refreshtoken.entity.User;
import com.te.refreshtoken.service.UserService;

@SpringBootApplication
public class RefreshTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefreshTokenApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "Reshma Satpute", "reshu", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Amir Mulla", "amir", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Sushma Guttal", "sushma", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Ajay Kumar", "ajay", "1234", new ArrayList<>()));

			userService.addRoleToUser("reshu", "ROLE_USER");
			userService.addRoleToUser("amir", "ROLE_MANAGER");
			userService.addRoleToUser("sushma", "ROLE_ADMIN");
			userService.addRoleToUser("ajay", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("ajay", "ROLE_ADMIN");
			userService.addRoleToUser("ajay", "ROLE_USER");
		};
	}
}