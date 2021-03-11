package com.example.hello.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface HelloService {

	String hello(String name);
}
