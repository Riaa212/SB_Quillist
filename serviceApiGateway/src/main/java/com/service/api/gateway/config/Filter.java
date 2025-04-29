package com.service.api.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import com.service.api.gateway.Utils.Jwtutils;

import reactor.core.publisher.Flux;

@Component
public class Filter extends AbstractGatewayFilterFactory<Filter.Config>
{
	
	@Autowired
	private RouteValidator routeValidator;

	public static class Config{
		
	}
	
	public Filter()
	{
		super(Config.class);
	}
	
	@Autowired
	private Jwtutils jwtutils;
	
	@Override
	public GatewayFilter apply(Config config) {
		return (exchange,chain)->{
			if(routeValidator.isSecured.test(exchange.getRequest()))
			{
				
//			    System.err.println("inside validator =====> "+exchange.getRequest().getPath());
//				System.err.println("response"+exchange.getResponse().);
				if(!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION))
				{
					throw new RuntimeException("authorization header missing..");
				}
				String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
				
//				Flux<DataBuffer> body = exchange.getRequest().getBody();
				
//				System.err.println(body);
//				body.cache();
				
				if(authHeader!=null && authHeader.startsWith("Bearer ")) //header prefix Bearer
				{
					authHeader = authHeader.substring(7);//remove bearer
					jwtutils.validateTocken(authHeader);
					//System.out.println("Verified.."+jwtutils.verifTockenInMemoryUserName(authHeader));
				}
			}
			return chain.filter(exchange);
		};
	}
	
	
}
