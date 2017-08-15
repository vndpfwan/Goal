package com.goal.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.goal.baseTest.SpringTestCase;
import com.goal.po.User;

public class UserServiceTest extends SpringTestCase {
	@Autowired
	private UserService userService;
	Logger logger = LoggerFactory.getLogger(UserServiceTest.class);
	
	@Test
	public void selectUserIdTest(){
		User user =userService.selectUserById(1);
		logger.debug("查找结果"+user);
	}
}
