package com.spring.boot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.boot.service.PersonService;

@Controller
@RequestMapping("/temp")
public class TemplatesController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/hello")
	public String hello(Map<String,Object> result){
		result.put("name", "周兴美");
		return "hello";
	}
	
	@RequestMapping("/getAll")
	public String getAll(Map<String,Object> map){
		map.put("persons", personService.getAll());
		map.put("name", "admin");
		return "personList";
	}
}
