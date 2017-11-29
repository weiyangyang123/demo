package com.tc25.bean;

import java.io.Serializable;

/**
 * 
 * @Title      : User.java
 * @Package    : com.tc25.bean
 * @Description: 用户类
 *
 * @author     Administrator
 * @date       2017年11月20日下午7:26:06
 * @version    1.0
 */
public class User implements Comparable<User>, Serializable {
	
	
	

	private static final long serialVersionUID = 3320053781614071154L;
	private String userAccount;//用户账号
	private String userName;//用户昵称
	private int userId;//用户Id
	private String userPwd;//用户密码
	private String userPwdTip;//用户密码提示
	private boolean userStatus;//用户状态
	public User() {
		super();
	}
	public User(String userAccount, String userName, int userId, String userPwd, String userPwdTip,
			boolean userStatus) {
		super();
		this.userAccount = userAccount;
		this.userName = userName;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userPwdTip = userPwdTip;
		this.userStatus = userStatus;
	}
	public User(String userAccount, String userName, String userPwd, String userPwdTip, boolean userStatus) {
		super();
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userPwdTip = userPwdTip;
		this.userStatus = userStatus;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserPwdTip() {
		return userPwdTip;
	}
	public void setUserPwdTip(String userPwdTip) {
		this.userPwdTip = userPwdTip;
	}
	public boolean isUserStatus() {
		return userStatus;
	}
	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "User [userAccount=" + userAccount + ", userName=" + userName + ", userId=" + userId + ", userPwd="
				+ userPwd + ", userPwdTip=" + userPwdTip + ", userStatus=" + userStatus + "]";
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
