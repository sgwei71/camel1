package com.sunggyu.camel.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRouterConfiguration {

	@Bean
	RouteBuilder myroute() {
		return new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				// TODO Auto-generated method stub
				from("jms:imsi")
				.to("file:/imsi");
			}
		};
		
	}
}
