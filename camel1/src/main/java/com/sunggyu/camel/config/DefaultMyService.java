package com.sunggyu.camel.config;

import org.apache.camel.CamelContext;

public class DefaultMyService implements MyService {

	private CamelContext camelContext;
	
	public DefaultMyService(CamelContext camelContext) {
		// TODO Auto-generated constructor stub
		this.setCamelContext(camelContext);
	}

	public CamelContext getCamelContext() {
		return camelContext;
	}

	public void setCamelContext(CamelContext camelContext) {
		this.camelContext = camelContext;
	}
	
	

}
