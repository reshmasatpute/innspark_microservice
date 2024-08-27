package com.te.usercontacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.usercontacts.entity.Contacts;

@Repository
public interface ContactRepository extends JpaRepository<Contacts, Integer> {

}
