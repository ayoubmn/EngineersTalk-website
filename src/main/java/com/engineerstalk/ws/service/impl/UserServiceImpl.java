package com.engineerstalk.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engineerstalk.ws.UserRepository;
import com.engineerstalk.ws.io.entity.UserEntity;
import com.engineerstalk.ws.service.UserService;
import com.engineerstalk.ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
	
	//public UserServiceImpl(){}

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDto createUser(UserDto user) {
		UserEntity userEntity= new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setEncryptedPassword("test");
		userEntity.setUserId("testUserId");
		UserEntity storeduserdetails=userRepository.save(userEntity);
		UserDto returnValue=new UserDto();
		BeanUtils.copyProperties(storeduserdetails, returnValue);
		return returnValue;
	}

}
