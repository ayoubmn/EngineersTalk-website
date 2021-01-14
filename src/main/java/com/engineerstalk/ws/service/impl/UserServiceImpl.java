package com.engineerstalk.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.engineerstalk.ws.UserRepository;
import com.engineerstalk.ws.io.entity.UserEntity;
import com.engineerstalk.ws.service.UserService;
import com.engineerstalk.ws.shared.Utils;
import com.engineerstalk.ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
	

	@Autowired
	UserRepository userRepository;
	@Autowired
	Utils utils;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@Override
	public UserDto createUser(UserDto user) {
		//check if user already exists
		//TODO why the message is not displayed in postman
		if(userRepository.findByEmail(user.getEmail())!=null) throw new RuntimeException("email already used");
		
		
		UserEntity userEntity= new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		//get the generated user id
		String publicUserId=utils.generateUserId(30);
		userEntity.setUserId(publicUserId);
		UserEntity storeduserdetails=userRepository.save(userEntity);
		UserDto returnValue=new UserDto();
		BeanUtils.copyProperties(storeduserdetails, returnValue);
		return returnValue;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
