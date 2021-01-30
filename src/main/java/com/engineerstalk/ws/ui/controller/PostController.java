package com.engineerstalk.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineerstalk.ws.service.PostService;
import com.engineerstalk.ws.shared.dto.PostDto;
import com.engineerstalk.ws.ui.model.request.PostDetailsRequestModel;
import com.engineerstalk.ws.ui.model.response.PostRest;

@RestController
@RequestMapping("posts") // http://localhost:8080/posts

public class PostController {
	@Autowired
	PostService postService;

	@GetMapping
	public String getPost() {
		return "get Post was called";
	}
	@PostMapping
	public PostRest createPost(@RequestBody PostDetailsRequestModel PostDetails){
		PostRest returnValue=new PostRest();
		PostDto postDto=new  PostDto();
		BeanUtils.copyProperties(PostDetails, postDto);
		PostDto createdPost=postService.createPost(postDto);
		BeanUtils.copyProperties(createdPost, returnValue);

		return returnValue;
	}
	@PutMapping
	public String updatePost(){
		return "update Post was called";
	}
	@DeleteMapping
	public String deletePost(){
		return "delete Post was called";
	}
}
