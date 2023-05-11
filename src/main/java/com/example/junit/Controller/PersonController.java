package com.example.junit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.junit.Service.PersonService;
import com.example.junit.entity.Person;

@RestController
public class PersonController {

	@Autowired
	PersonService personService; 

	@GetMapping("/person")
	public ResponseEntity<?> getAllPersone(){
		 List<Person> allpersone = personService.getAllpersone();
		 return ResponseEntity.ok(allpersone);
	}
	
	
}
