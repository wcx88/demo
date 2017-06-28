package com.wcx.mod.user.entity;

import java.sql.Timestamp;

public class UserEntity {
	private long id;
	private String userId;
	private String userName;
	private String password;
	private Timestamp lastLoginTime;
	private String remark;
	
	public UserEntity() {
		super();
	}
	public UserEntity(String userId, String userName, String password,
			Timestamp lastLoginTime, String remark) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.lastLoginTime = lastLoginTime;
		this.remark = remark;
	}
	public UserEntity(long id, String userId, String userName, String password,
			Timestamp lastLoginTime, String remark) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.lastLoginTime = lastLoginTime;
		this.remark = remark;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userId=" + userId + ", userName="
				+ userName + ", password=" + password + ", remark=" + remark
				+ ", lastLoginTime=" +  lastLoginTime + "]";
	}

}
