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

import com.engineerstalk.ws.service.CommentService;
import com.engineerstalk.ws.service.PostService;
import com.engineerstalk.ws.shared.dto.CommentDto;
import com.engineerstalk.ws.shared.dto.PostDto;
import com.engineerstalk.ws.ui.model.request.CommentDetailsRequestModel;
import com.engineerstalk.ws.ui.model.request.PostDetailsRequestModel;
import com.engineerstalk.ws.ui.model.response.CommentRest;
import com.engineerstalk.ws.ui.model.response.PostRest;

@RestController
@RequestMapping("comment") // http://localhost:8080/comment

public class CommentController {
	@Autowired
	CommentService commentService;

	@GetMapping
	public String getComment() {
		return "get Comment was called";
	}
	@PostMapping
	public CommentRest createComment(@RequestBody CommentDetailsRequestModel CommentDetails){
		CommentRest returnValue=new CommentRest();
		CommentDto commentDto=new  CommentDto();
		BeanUtils.copyProperties(CommentDetails, commentDto);
		CommentDto createdComment=commentService.createComment(commentDto);
		BeanUtils.copyProperties(createdComment, returnValue);

		return returnValue;
	}
	@PutMapping
	public String updateComment(){
		return "update Comment was called";
	}
	@DeleteMapping
	public String deleteComment(){
		return "delete Comment was called";
	}
}
