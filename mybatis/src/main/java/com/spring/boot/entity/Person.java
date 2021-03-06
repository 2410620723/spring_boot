package com.spring.boot.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 创建实体类
 * 使用@Entity来持久化类
 * @author zxm
 *
 */
public class Person {
	private int id;
	private String name;
	private int age;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date birth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

}
