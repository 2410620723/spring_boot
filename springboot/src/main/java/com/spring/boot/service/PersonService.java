package com.spring.boot.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.spring.boot.dao.PersonDao;
import com.spring.boot.model.Person;
import com.spring.boot.repository.Person2Repository;
import com.spring.boot.repository.PersonRepository;

@Service
public class PersonService {
	@Resource
	public PersonRepository personRepository;
	
	@Resource
	public Person2Repository person2Repository;
	
	@Resource
	private PersonDao personDao;
	
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
	
	public List<Person> findByName(String name){
		return person2Repository.findByName(name);
	}
	
	public List<Person> queryByName(String name){
		return person2Repository.queryByName(name);
	}
	
	public List<Person> selectByName(String name){
		return personDao.selectByName(name);
	}
}
