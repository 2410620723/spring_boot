package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.entity.Person;
import com.spring.boot.mapper.PersonMapper;
@Service
public class PersonService {
	@Autowired
	private PersonMapper personMapper;
	
	public List<Person> getPersons(){
		return personMapper.getPersonList();
	}

	public Person getPersonById(int id) {
		return personMapper.getPersonById(id);
	}
	@Transactional
	public void save(Person person){
		personMapper.save(person);
	}
	
}
