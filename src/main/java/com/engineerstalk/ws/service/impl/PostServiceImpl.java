package com.engineerstalk.ws.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engineerstalk.ws.io.entity.PostEntity;
import com.engineerstalk.ws.io.repositories.PostRepository;
import com.engineerstalk.ws.service.PostService;
import com.engineerstalk.ws.shared.dto.PostDto;

@Service
public class PostServiceImpl implements PostService{
	@Autowired
	PostRepository postRepository;

	@Override
	public PostDto getPost(String id) {
		return null;
	}

	@Override
	public PostDto createPost(PostDto post) {
		PostEntity postEntity= new PostEntity();
		BeanUtils.copyProperties(post, postEntity);
		postEntity.setDate(new Date());
		PostEntity storedPostdetails=postRepository.save(postEntity);
		PostDto returnValue=new PostDto();
		BeanUtils.copyProperties(storedPostdetails, returnValue);
		return returnValue;
	}
	

}
