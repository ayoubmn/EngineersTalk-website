package com.engineerstalk.ws.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engineerstalk.ws.io.entity.CommentEntity;
import com.engineerstalk.ws.io.entity.PostEntity;
import com.engineerstalk.ws.io.repositories.CommentRepository;
import com.engineerstalk.ws.io.repositories.PostRepository;
import com.engineerstalk.ws.service.CommentService;
import com.engineerstalk.ws.shared.dto.CommentDto;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	CommentRepository commentRepository;

	@Autowired
	PostRepository postRepository;

	@Override
	public CommentDto getComment(String id) {
		return null;
	}

	@Override
	public CommentDto createComment(CommentDto commentDto) {
		CommentEntity commentEntity= new CommentEntity();
		System.out.println("-------------  dto "+commentDto.getId_post());
		PostEntity post=postRepository.findByIdPost(commentDto.getId_post());
		System.out.println("-------------  post "+post.getIdPost());

		BeanUtils.copyProperties(commentDto, commentEntity);
		commentEntity.setDate(new Date());
		commentEntity.setPost(post);
		CommentEntity storedCommentdetails=commentRepository.save(commentEntity);
		CommentDto returnValue=new CommentDto();
		BeanUtils.copyProperties(storedCommentdetails, returnValue);
		returnValue.setId_post(commentDto.getId_post());
		
		return returnValue;
	}

	
}
