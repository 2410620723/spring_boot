package spring.boot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.boot.model.SysUser;
import spring.boot.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/hello")
	public String hello(Map<String,Object> map){
		Iterable<SysUser> users = userservice.findAll();
		map.put("users", users);
		return "hello";
	}
	
	@RequestMapping("/admin")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String admin(){
		return "admin";
	}
}
