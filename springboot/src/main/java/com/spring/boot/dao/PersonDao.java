package com.spring.boot.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.boot.model.Person;

@Repository
public class PersonDao {
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public List<Person> selectByName(String name){
		String sql = "select * from person where name=?";
		RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
		List<Person> persons = jdbcTemplate.query(sql, new Object[]{name}, rowMapper);
		
		return persons;
	}
}
