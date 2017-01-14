package com.spring.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.spring.boot.entity.Person;

public interface PersonMapper {
	@Select("select * from Person")
	public List<Person> getPersonList();
	
	@Select("select * from Person where id=#{id}")
	public Person getPersonById(int id);
	
	@Insert("insert into Person(age,birth,name) values(#{age},#{birth},#{name})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")//返回主键信息
	public void save(Person person);
}
