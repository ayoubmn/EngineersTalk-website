package com.engineerstalk.ws.service;

import com.engineerstalk.ws.shared.dto.PostDto;

public interface PostService {
	PostDto getPost(String id);
	PostDto createPost(PostDto postDto);

}
