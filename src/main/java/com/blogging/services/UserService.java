package com.blogging.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blogging.payLoad.UserDto;


public interface UserService {
	
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user ,Integer userId);
	UserDto getUserByID(Integer userId);
	List<UserDto> getAllUser();
	
	void deleteUser(Integer userId);
	
}
