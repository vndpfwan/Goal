package com.goal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goal.dao.UserDAO;
import com.goal.po.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	
	public User selectUserById(Integer userId) {
		return userDAO.selectUserById(userId);
	}
}
