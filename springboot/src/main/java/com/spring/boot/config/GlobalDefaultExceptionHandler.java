package com.spring.boot.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理类
 * 在class上添加@ControllerAdvice
 * 在class中添加方法
 * 在方法上添加@ExceptionHandler来拦截相应的异常信息
 * 如果返回的是view，则返回值是ModelAndView
 * 如果返回的是String或json，则在相应的方法上添加@ResponseBody
 * @author Administrator
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest req,Exception e){
		return "服务器繁忙，请稍后再试！";
	}
}
