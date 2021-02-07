package com.engineerstalk.ws.io.repositories;

import org.springframework.data.repository.CrudRepository;

import com.engineerstalk.ws.io.entity.MessageEntity;

public interface MessageRepository extends CrudRepository<MessageEntity, Long> {

}
