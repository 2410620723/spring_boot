package com.spring.boot.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.spring.boot.model.Person;
import com.spring.boot.repository.PersonRepository;

@Service
public class PersonService {
	@Resource
	public PersonRepository personRepository;
	
	@Transactional
	public void save(Person person){
		personRepository.save(person);
	}
	
	@Transactional
	public void delete(int id){
		personRepository.delete(id);
	}
	public Iterable<Person> getAll(){
		return personRepository.findAll();
	}
}
