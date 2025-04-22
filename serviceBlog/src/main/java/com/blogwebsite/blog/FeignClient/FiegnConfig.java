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
	return "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzYWhpbDM0QGdtYWlsLmNvbSIsImlhdCI6MTc0NTIzOTM4MiwiZXhwIjoxNzQ1MjU3MzgyfQ.Kke-_-rTR_Ne3MLmCANmRNxa7J5w50coDxJ0IdqyOLo";
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