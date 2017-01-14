package com.spring.boot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/temp")
public class TemplatesController {
	@RequestMapping("/hello")
	public String hello(Map<String,Object> result){
		result.put("name", "周兴美");
		return "hello";
	}
}
