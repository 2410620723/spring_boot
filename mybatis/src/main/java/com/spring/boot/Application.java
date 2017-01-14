package com.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@SpringBootApplication
@MapperScan("com.spring.boot.mapper")//扫描该包下相应的mybatis持久化类
public class Application {
	/**
	 * 配置fastJson
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters(){
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig config = new FastJsonConfig();
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		converter.setFastJsonConfig(config);
		HttpMessageConverter<?> messageConverter = converter;
		return new HttpMessageConverters(messageConverter);
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
