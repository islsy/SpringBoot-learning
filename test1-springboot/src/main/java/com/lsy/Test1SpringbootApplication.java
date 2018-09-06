package com.lsy;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT.value;


@RestController
@SpringBootApplication
public class Test1SpringbootApplication {

	@Value(value="${app.creater}")
	private String appCreater;
	@Value(value="${app.name}")
	private String appName;


	public static void main(String[] args) {
		SpringApplication.run(Test1SpringbootApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Test1SpringbootApplication.class);
		//builder.bannerMode(Banner.Mode.OFF);  将启动图案关闭
	}


	@RequestMapping(value="/",produces="text/plain;charset=UTF-8")
	String index(){
		return  "Hello Spring Boot! --edited by "+appCreater+"  be named by "+appName;
	}

}
