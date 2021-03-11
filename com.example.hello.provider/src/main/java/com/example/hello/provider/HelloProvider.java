package com.example.hello.provider;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ExportedService;

import com.example.hello.api.HelloService;

@Component
@ExportedService(service_exported_interfaces = HelloService.class, service_exported_configs = "ecf.generic.server")
public class HelloProvider implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}


}
