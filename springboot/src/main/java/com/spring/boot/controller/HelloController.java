package com.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/worldNew")
	public String worldNew(){
		return "hello";
	}
	@RequestMapping("/hello")
	public String hello(){
		return "hello 2017";
	}
	@RequestMapping("world")
	public String world(){
		return "world";
	}
}
