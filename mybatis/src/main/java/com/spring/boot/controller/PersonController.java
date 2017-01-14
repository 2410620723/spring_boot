package com.spring.boot.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.spring.boot.entity.Person;
import com.spring.boot.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/getPersons")
	public List<Person> getPersons(int start){
		PageHelper.startPage(start, 2);
		return personService.getPersons();
	}
	
	@RequestMapping("/getPersonById")
	public Person getPersonById(int id){
		return personService.getPersonById(id);
	}
	
	@RequestMapping("/save")
	public Person save(){
		Person person = new Person();
		person.setAge(24);
		person.setBirth(new Date());
		person.setName("张三");
		personService.save(person);
		return person;
	}
}
