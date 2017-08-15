package com.goal.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.goal.dao.UserDAO;
import com.goal.po.User;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User selectUserById(Integer userId) {
		return userDAO.selectUserById(userId);
	}
}
