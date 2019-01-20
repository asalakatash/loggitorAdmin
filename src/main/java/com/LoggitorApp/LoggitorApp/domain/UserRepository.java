package com.LoggitorApp.LoggitorApp.domain;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository <User, Long> {
	ArrayList<UsersOnHP> getUsersONHP(@Param("UserName") String UserName);

}
