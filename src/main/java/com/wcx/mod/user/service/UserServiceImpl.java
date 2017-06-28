package com.wcx.mod.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcx.mod.user.dao.UserDao;
import com.wcx.mod.user.entity.UserEntity;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao = null;
	
	

	@Override
	public UserEntity getUser(long id) {
		return userDao.getUser(id);
	}
	
	@Override
	public UserEntity getUser(String userId) {
		return userDao.getUser(userId);
	}

	@Override
	public List<UserEntity> queryUserList(int pageNo, int pageSize) {
		return userDao.queryUserList(pageNo, pageSize);
	}
	
	@Override
	public String queryUserListCount() {
		return userDao.queryUserListCount();
	}

	@Override
	public void updateLastLoginTime(String userId) {		
		userDao.updateUser(userId);
	}

	@Override
	public void updateUser(UserEntity user) {
		userDao.updateUser(user);
	}
}
