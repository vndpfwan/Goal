package com.goal.dao;

import com.goal.po.User;

public interface UserDAO {
	public User selectUserById(Integer userId);
}
