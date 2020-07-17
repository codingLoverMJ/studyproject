package com.toyproject.common;

import javax.annotation.Resource;

import org.springframework.boot.test.context.SpringBootTest;

import com.toyproject.user.service.UserService;

@SpringBootTest(properties = {"spring.config.location = classpath:application.properties"})
public class DBTest {

	@Resource(name = "UserService")
	UserService userService;

}



