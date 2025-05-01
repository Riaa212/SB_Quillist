package com.blogwebsite.blog.FeignClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

//@Configuration
public class FiegnConfig {

	
//	  @Bean
//	    public RequestInterceptor requestInterceptor() {
//	        return requestTemplate -> {
//	            requestTemplate.header("Authorization", "Bearer " + getAuthToken());
//	        };
//	    }
//
//	    private String getAuthToken() {
//	        // Retrieve your token here
//	    	
//	return "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqb2huQGdtYWlsLmNvbSIsImlhdCI6MTc0NTkwMjkyNSwiZXhwIjoxNzQ1OTIwOTI1fQ.1Ze3cQUumfQiJaByaG-czJzg056N8yRR9V6UprKhJgw";
//	    }
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