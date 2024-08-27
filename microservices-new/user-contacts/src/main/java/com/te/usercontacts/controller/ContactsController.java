package com.te.usercontacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.usercontacts.entity.Contacts;
import com.te.usercontacts.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactsController {
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/{userId}")
	public List<Contacts> getContactOfUser(@PathVariable Integer userId){
		return contactService.getContactOfUser(userId);
		
	}

}
