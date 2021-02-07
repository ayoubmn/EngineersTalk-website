package com.engineerstalk.ws;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;



@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

	  @Override
	  public void registerStompEndpoints(StompEndpointRegistry
	   registry) {
	    registry.addEndpoint("/chat")
	        .setAllowedOrigins("*").withSockJS();
	  }

	  @Override
	  public void configureMessageBroker(MessageBrokerRegistry config){ 
	    config.enableSimpleBroker("/topic/", "/queue/");
	    config.setApplicationDestinationPrefixes("/app");
	  }
	}