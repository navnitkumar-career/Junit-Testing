package com.example.junit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junit.entity.Person;
import com.example.junit.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	public List<Person> getAllpersone() {
		return this.personRepo.findAll();
	}

	public PersonService(PersonRepo personRepo) {
		super();
		this.personRepo = personRepo;
	}
	
	

}
