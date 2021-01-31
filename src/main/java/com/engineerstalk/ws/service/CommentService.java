package com.engineerstalk.ws.service;

import com.engineerstalk.ws.shared.dto.CommentDto;

public interface CommentService {
	CommentDto getComment(String id);
	CommentDto createComment(CommentDto commentDto);

}
