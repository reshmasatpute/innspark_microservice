package com.te.springsecurityjwt.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (username.equals("Reshma")) {
			
			return new org.springframework.security.core.userdetails.User("Reshma", "Reshu", new ArrayList<>());
		}
		else {
			throw new UsernameNotFoundException("User Not Found");
		}
	}

}
