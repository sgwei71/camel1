package com.sunggyu.camel.route;

import org.apache.camel.builder.RouteBuilder;

public class MyRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("{{route.from}}")
		.to("{{route.to}}");
	}

}
