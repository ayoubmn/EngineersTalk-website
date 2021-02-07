package com.engineerstalk.ws.io.repositories;

import org.springframework.data.repository.CrudRepository;

import com.engineerstalk.ws.io.entity.ChatRoomEntity;
import com.engineerstalk.ws.io.entity.UserEntity;

public interface ChatRoomRepository extends CrudRepository<ChatRoomEntity, Long> {

	ChatRoomEntity findById(long id);

}
