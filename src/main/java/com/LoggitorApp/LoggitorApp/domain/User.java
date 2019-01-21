package com.LoggitorApp.LoggitorApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.math.BigInteger;
import java.util.Set;

import javax.persistence.*;
@Entity
@SqlResultSetMapping(
		name="usersOnHPMapping",
	    classes={
	        @ConstructorResult(
	        		targetClass=UsersOnHP.class,
	            columns={
		            @ColumnResult(name="USER_ID", type = BigInteger.class),
	                @ColumnResult(name="USER_NAME", type = String.class),
	                @ColumnResult(name="PHONE", type = String.class),
	                @ColumnResult(name="ROLE_NAME", type = String.class),
	             //   @ColumnResult(name="LOGGED IN", type = String.class)

	            }
	        )
	    }
	)
 @NamedNativeQuery(name="User.getUsersOnHP",
        query="SELECT USER.USER_ID, USER.USER_NAME , USER.PHONE, ROLE.ROLE_NAME" + 
 		" FROM USER " + 
 		"INNER JOIN USER_ROLE ON USER.USER_ID=USER_ROLE.USER_ID " + 
 		"INNER JOIN ROLE ON ROLE.ROLE_ID=USER_ROLE.ROLE_ID",
 		resultSetMapping="usersOnHPMapping")
 
// 
// "SELECT USER.NAME, USER.PHONE, ROLE.ROLE_NAME"
// + "FROM USER INNER JOIN "
// + "((INNER JOIN USER_ROLE ON USER.USERID = USER_ROLE.USER_ID) "
// + "ON ROLE.ROLEID = USER_ROLE.ROLE_ID",resultSetMapping="UsersOnHPMapping")


//@NamedNativeQuery(name="Users.getUsersOnHP", query="SELECT USER.USERNAME, USER.PHONE, ROLE.ROLE_NAME "
//		+ "FROM USER INNER JOIN "
//		+ "((INNER JOIN USER_ROLE ON USER.USERID = USER_ROLE.USER_ID) "
//		+ "ON ROLE.ROLEID = USER_ROLE.ROLE_ID",resultSetMapping="UsersOnHPMapping")

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long UserId;
	@Column(unique=true)
	private String UserName;
	private String Phone;
	private String Name;
	private String Password;
	
    
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "User_Role", joinColumns = @JoinColumn(name = "User_id", referencedColumnName = "UserId"),
    inverseJoinColumns = @JoinColumn(name = "Role_id", referencedColumnName = "RoleId"))
    private Set<Role> roles;
    public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User() {
		super();
	}

	public User(String userName_gmail, String phone, String name, String password, Set<Role> roles) {
		super();
		UserName = userName_gmail;
		Phone = phone;
		Name = name;
		Password = password;
		this.roles = roles;
	}

	
	public User(String userName_gmail, String phone, String name, String password) {
		super();
		UserName = userName_gmail;
		Phone = phone;
		Name = name;
		Password = password;
	}

	public String getUserName_gmail() {
		return UserName;
	}

	public void setUserName_gmail(String userName_gmail) {
		UserName = userName_gmail;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
}
