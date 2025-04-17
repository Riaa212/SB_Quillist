package com.blogwebsite.blog.FeignClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

@Configuration
public class FiegnConfig {

	
	  @Bean
	    public RequestInterceptor requestInterceptor() {
	        return requestTemplate -> {
	            requestTemplate.header("Authorization", "Bearer " + getAuthToken());
	        };
	    }

	    private String getAuthToken() {
	        // Retrieve your token here
	return "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzYWhpbEBnbWFpbC5jb20iLCJpYXQiOjE3NDQ4ODk4NzMsImV4cCI6MTc0NDkwNzg3M30.LjRwfs2SqONDNiNbvomZWWu4gIahrDmI384Bx18jpKI";
	    }
}

//@Configuration
//public class FeignConfig {
//    @Bean
//    public RequestInterceptor requestInterceptor() {
//        return requestTemplate -> {
//            requestTemplate.header("Authorization", "Bearer " + getAuthToken());
//        };
//    }
//    
//    private String getAuthToken() {
//        // Retrieve your token here
//        return "your-auth-token";
//    }
//}