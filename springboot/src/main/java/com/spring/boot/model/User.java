package com.spring.boot.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
	private String name;
	private int age;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date birth;
	@JSONField(serialize=false)
	private String remark;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
