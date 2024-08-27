package com.te.usercontacts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.usercontacts.entity.Contacts;
import com.te.usercontacts.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;

	public List<Contacts> getContactOfUser(Integer userId) {
		return contactRepository.findAll();
		
	}
}
