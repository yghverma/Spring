package com.pack.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements DisposableBean, InitializingBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialing Person Bean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Person Bean");		
	}
	
	@PostConstruct
	public void customInit() {
		System.out.println("Custom Post Construct Person Bean");	
	}
	@PreDestroy
	public void customDestroy() {
		System.out.println("Custom Pre Destroy Person Bean");	
	}
}