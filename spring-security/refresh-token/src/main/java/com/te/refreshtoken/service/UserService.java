package com.te.refreshtoken.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.te.refreshtoken.entity.Role;
import com.te.refreshtoken.entity.User;
import com.te.refreshtoken.repository.RoleRepository;
import com.te.refreshtoken.repository.UserRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class UserService {

	
	private final UserRepository userRepository;
	
	private final RoleRepository roleRepository;

	private final PasswordEncoder passwordEncoder;
	public User saveUser(User user) {
		return userRepository.save(user);

	}

	public Role saveRole(Role role) {
		return roleRepository.save(role);

	}

	public void addRoleToUser(String username, String roleName) {
		User user = userRepository.findByUsername(username);
		Role role = roleRepository.findByName(roleName);
		user.getRoles().add(role);
	}

	public User getUser(String username) {
		return userRepository.findByUsername(username);

	}

	public List<User> getAll() {
		return userRepository.findAll();

	}

}
