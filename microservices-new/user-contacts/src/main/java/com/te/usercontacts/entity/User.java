package com.te.usercontacts.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User-Details")
public class User {
	@Id
	private Integer userId;
	private String name;
	private String phone;
	
	@OneToMany
	private List<Contacts> contacts;
}
