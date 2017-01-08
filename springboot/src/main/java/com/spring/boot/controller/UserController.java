package com.spring.boot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.User;

@RestController
public class UserController {
	@RequestMapping("/getUser")
	public User getUser(){
		User user = new User();
		user.setName("周兴美");
		user.setAge(23);
		user.setBirth(new Date());
		user.setRemark("备注");
		return user;
	}
}
