package com.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
