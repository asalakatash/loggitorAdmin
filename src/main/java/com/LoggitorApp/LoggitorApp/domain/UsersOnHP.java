package com.LoggitorApp.LoggitorApp.domain;

import java.math.BigInteger;

public class UsersOnHP {
	String UserName;
	String UserPhone;
	String RoleName;
//	String LogedIn;
	public UsersOnHP(String userName, String userPhone, String roleName) {
		super();
		UserName = userName;
		UserPhone = userPhone;
		RoleName = roleName;
		//LogedIn = logedIn;
	}
	public UsersOnHP() {
		
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
