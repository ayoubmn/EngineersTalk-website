package com.engineerstalk.ws.io.repositories;

import org.springframework.data.repository.CrudRepository;

import com.engineerstalk.ws.io.entity.CommentEntity;

public interface CommentRepository extends CrudRepository<CommentEntity, Long> {

	//UserEntity findByEmail(String email);
}
