package com.engineerstalk.ws.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.engineerstalk.ws.io.entity.PostEntity;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {

	PostEntity findByIdPost(long idPost);
}
