package com.te.usercontacts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Contact-Details")
public class Contacts {
	@Id
	private Integer cId;
	private String email;
	private String contactName;
	@ManyToOne
	private User user;
}
