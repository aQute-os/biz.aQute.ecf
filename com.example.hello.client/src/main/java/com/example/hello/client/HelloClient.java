package com.example.hello.client;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.example.hello.api.HelloService;
import org.apache.felix.service.command.annotations.GogoCommand;

@Component(service=HelloClient.class)
@GogoCommand(scope="client", function="hello")
public class HelloClient {

	private HelloService hello;

	@Activate
	public HelloClient(@Reference HelloService hello) {
		this.hello = hello;
	}

	public String hello( String name) {
		return hello.hello(name);
	}

}
