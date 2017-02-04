package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//读取配置文件中的值
	@Value("${book.name}")
	private String bookName;
	
	@Value("${book.author}")
	private String bookAuthor;
	
	@RequestMapping("/book")
	public String book(){
		return "the book name is "+bookName+" ,author is "+bookAuthor;
	}
	
	
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
