package com.example.junit.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.junit.entity.Person;

@SpringBootTest
class PersonRepoTest {

	@Autowired
	private PersonRepo personRepo;
	
	
	@Test
	void contextLoads() {
		System.out.println("hello");
	}
	
	 @Test
	 void isPersonExitsById() {
		 Person p=new Person(125,"milan","surat");
		 personRepo.save(p);
		 Boolean Result =personRepo.isPersonExitsById(1075);
		 assertThat(Result).isTrue();
	 }
	 
	 
	 
	 
}
