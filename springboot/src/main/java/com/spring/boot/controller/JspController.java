package com.spring.boot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {
	@RequestMapping("/helloJsp")
	public String helloJsp(Map<String, Object> map){
		map.put("age", 23);
		return "hello";
	}

}
