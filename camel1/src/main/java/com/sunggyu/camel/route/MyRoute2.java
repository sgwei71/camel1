package com.sunggyu.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute2 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("jms:invoices").to("file:/invoices");
	}

}
