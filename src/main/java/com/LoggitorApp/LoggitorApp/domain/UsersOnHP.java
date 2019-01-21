package com.LoggitorApp.LoggitorApp.domain;

import java.math.BigInteger;

public class UsersOnHP {
	String UserName;
	String UserPhone;
	String RoleName;
	BigInteger UserId;
//	String LogedIn;
	
	public UsersOnHP() {
		
	}
	public UsersOnHP( BigInteger userId,String userName, String userPhone, String roleName) {
		super();
		UserName = userName;
		UserPhone = userPhone;
		RoleName = roleName;
		UserId = userId;
	}

	public BigInteger getUserId() {
		return UserId;
	}
	public void setUserId(BigInteger userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPhone() {
		return UserPhone;
	}
	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
//	public String getLogedIn() {
//		return LogedIn;
//	}
//	public void setLogedIn(String logedIn) {
//		LogedIn = logedIn;
//	}
//	
	
	
	
}
