package com.spring.boot.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.Person;
import com.spring.boot.service.PersonService;

@RestController
public class PersonController {
	@Resource
	private PersonService personService;
	
	@RequestMapping("/save")
	public void save(){
		Person person = new Person();
		person.setName("Jack");
		person.setAge(25);
		person.setBirth(new Date());
		personService.save(person);
	}
	@RequestMapping("/delete")
	public void delete(int id){
		personService.delete(id);
	}
	@RequestMapping("/getAll")
	public Iterable<Person> getAll(){
		return personService.getAll();
	}
	
	
	
	
	
	
}
