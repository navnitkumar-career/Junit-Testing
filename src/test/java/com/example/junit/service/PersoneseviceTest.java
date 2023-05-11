package com.example.junit.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.junit.Service.PersonService;
import com.example.junit.repo.PersonRepo;

@ExtendWith(MockitoExtension.class)
class PersoneseviceTest {

//	@Mock=> fake data mate

	@Mock
	private PersonRepo personRepo;

	private PersonService personService;

	@Test
	void contextLoads() {
		System.out.println("hello");
	}
	
	@BeforeEach
	void setUp() {
		this.personService = new PersonService(this.personRepo);
	}

	void getAllpersone() { 
		personService.getAllpersone();
		verify(personRepo).findAll();

	}

}
