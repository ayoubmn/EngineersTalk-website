package com.engineerstalk.ws.security;

import com.engineerstalk.ws.SpringApplicationContext;

public class SecurityConstants {

	public static final long EXPIRATION_TIME=864000000;// =10days
	public static final String TOKEN_PREFIX="Bearer ";
	public static final String HEADER_STRING="Authorization";
	public static final String SIGN_UP_URL="/user";

	public static String getTokenSecret()
	{
		
		AppProperties appProperties=(AppProperties) SpringApplicationContext.getBean("AppProperties");
		return appProperties.getTokenSecret();
	}
	//jf9i4jgu83nfl0
}
