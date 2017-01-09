package com.spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.spring.boot.model.Person;

public interface Person2Repository extends Repository<Person, Integer> {
	public List<Person> findByName(String name);
	
	@Query("from Person where name=:name")
	public List<Person> queryByName(@Param("name")String name);
}
