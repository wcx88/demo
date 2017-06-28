package com.wcx.mod.user.service;

import java.util.List;

import com.wcx.mod.user.entity.UserEntity;

public interface UserService {
	
	UserEntity getUser(long id);
	UserEntity getUser(String userId);
	List<UserEntity> queryUserList(int pageNo, int pageSize);
	String queryUserListCount();

	void updateLastLoginTime(String userId);
	void updateUser(UserEntity user);

}
